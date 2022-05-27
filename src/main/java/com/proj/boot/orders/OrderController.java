package com.proj.boot.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.product.Product;

@RestController
public class OrderController {
	@Autowired
	private OrderRepo orepo;

	@RequestMapping("/all-orders")
	public Iterable<Orders> getAllOrders() {
		return orepo.findAll();
	}
	@RequestMapping("/find-order/{oId}")
	public Orders viewOrder(@PathVariable("oId") int orderNumber) {
		return  orepo.findById(orderNumber).get();
		
	}
}
