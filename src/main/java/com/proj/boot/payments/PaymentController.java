package com.proj.boot.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.product.Product;



@RestController
public class PaymentController {
	@Autowired
	private PaymentRepo repo;

	@RequestMapping("/all-payments")
	public Iterable<Payment> getAllPayments() {
		return repo.findAll();
	}
	@RequestMapping("/find-payments/{pId}")
	public Payment viewPayment(@PathVariable("pId") String checkNumber) {
		return  repo.findById(checkNumber).get();
		
	}

}
