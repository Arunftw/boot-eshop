package com.proj.boot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements UserDetailsService {
	@Autowired
	private CustomerRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		int customerId = Integer.parseInt(username);
		Customer customer = repo.findById(customerId).get();
		if (customer == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		UserDetails user = User.withUsername(String.valueOf(customer.getCustomerNumber()))
				.password(encoder.encode(customer.getCustomerName())).authorities("USER").build();
		return user;
	}

}
