package com.proj.boot.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.proj.boot.customer.CustomerService;

@Component
public class TokenFilter extends OncePerRequestFilter {
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private CustomerService userService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String jwtToken = request.getHeader(HttpHeaders.AUTHORIZATION);
		if (jwtToken == null || jwtToken.isEmpty()) {
			filterChain.doFilter(request, response);
			return;
		}
		UserDetails userDetails = userService.loadUserByUsername(jwtTokenUtil.getUsernameFromToken(jwtToken));
		Boolean isTokenValid = jwtTokenUtil.validateToken(jwtToken, userDetails);
		if (!isTokenValid) {
			filterChain.doFilter(request, response);
			return;
		}

		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null,
				userDetails.getAuthorities());
		authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request) );
		SecurityContextHolder.getContext().setAuthentication(authentication);
		filterChain.doFilter(request, response);
		
		

	}

}
