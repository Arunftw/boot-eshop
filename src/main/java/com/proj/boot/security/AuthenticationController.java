package com.proj.boot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.customer.CustomerService;

@RestController
public class AuthenticationController {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private CustomerService userDetailService;

	@PostMapping("/authenticate")
	public ResponseEntity<?> doLogin(@RequestParam("username") String userName,
			@RequestParam("password") String password) {
		defaultAuth(userName, password);
		final UserDetails userDetails = userDetailService.loadUserByUsername(userName);
		final String jwtToken = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(jwtToken);

	}

	private void defaultAuth(String userName, String Password) {
		try {
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userName, Password);
			authenticationManager.authenticate(token);

		} catch (DisabledException ex) {
			throw ex;

		} catch (BadCredentialsException ex) {
			throw ex;
		}
	}

}
