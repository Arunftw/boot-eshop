package com.proj.boot.product;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	private static final Logger LOG = Logger.getLogger("ProductController");
	@Autowired
	private ProductRepo repo;

	@RequestMapping("/all-products")
	public Iterable<Product> getAllProducts() {
		return repo.findAll();
	}
	
	@RequestMapping("/find-product/{pId}")
	public Product viewProduct(@PathVariable("pId") String productCode) {
		return  repo.findById(productCode).get();
		
	}
	@PostMapping("/add-product")
	public Product addProduct(@RequestBody Product product) {
		return repo.save(product);
	}
	
	@RequestMapping("/delete-product/{pId}")
	public void viewDelete(@PathVariable("pId") String productCode) {
	Product p = repo.findById(productCode).get();
	repo.delete(p);	
	}
	
	
}