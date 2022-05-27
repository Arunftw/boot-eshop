package com.proj.boot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.contact.Contact;
import com.proj.boot.product.Product;


@RestController
public class CustomerController {
	@Autowired
	private CustomerRepo repo;

	@RequestMapping("/all-customers")
	public Iterable<Customer> getAllCustomers() {
		return repo.findAll();
	}
	@RequestMapping("/find-customer/{cId}")
	public Customer viewCustomer(@PathVariable("cId") int customerNumber) {
		return  repo.findById(customerNumber).get();
		
	}
	@PostMapping("/add-customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return repo.save(customer);
	}
}
