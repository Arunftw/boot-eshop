package com.proj.boot.offices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.product.Product;

@RestController
public class OfficeController {
	@Autowired
	private OfficeRepo repo;
	
	@RequestMapping("/all-offices")
	public Iterable<Office> getAllOffices(){
		return repo.findAll();
		
	}
	@RequestMapping("/find-office/{oId}")
	public Office viewOffice(@PathVariable("oId") int officeCode) {
		return  repo.findById(officeCode).get();
		
	}
	
}
