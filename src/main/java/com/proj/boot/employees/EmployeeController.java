package com.proj.boot.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.product.Product;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;

	@RequestMapping("/all-employees")
	public Iterable<Employee> getAllEmployees() {
		return repo.findAll();
	}
	@RequestMapping("/find-employee/{eId}")
	public Employee viewEmployee(@PathVariable("eId") int employeeNumber) {
		return  repo.findById(employeeNumber).get();
		
	}
}
