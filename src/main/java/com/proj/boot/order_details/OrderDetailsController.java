package com.proj.boot.order_details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.contact.Contact;
import com.proj.boot.product.Product;





@RestController
public class OrderDetailsController {
	@Autowired
	private OrderDetailsRepo repo;

	@RequestMapping("/all-orderdetails")
	public Iterable<OrderDetails> getAllOrderDetails() {
		return repo.findAll();
	}
	@RequestMapping("/find-orderdetails/{oId}")
	public OrderDetails viewOrderDetails(@PathVariable("oId") int orderNumber) {
		OrderDetails o = repo.findById(orderNumber).get();
		return o;
	}
	@PostMapping("/add-orderdetails")
	public OrderDetails addOrderDetails(@RequestBody OrderDetails orderDetails) {
		return repo.save(orderDetails);
	}
}
