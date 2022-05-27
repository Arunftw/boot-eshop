package com.proj.boot.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.boot.product.Product;
import com.proj.boot.product.ProductRepo;

@RestController
public class ContactController {
	@Autowired
	private ContactRepo repo;

	@RequestMapping("/all-contacts")
	public Iterable<Contact> getAllContacts() {
		return repo.findAll();
	}
	
	@RequestMapping("/find-contact/{cId}")
	public Contact viewContact(@PathVariable("cId") int contactId) {
		Contact c = repo.findById(contactId).get();
		return c;
	}
	@RequestMapping("/delete-contact/{cId}")
	public void viewDelete(@PathVariable("cId") int contactId) {
	Contact c = repo.findById(contactId).get();
	repo.delete(c);	
	}
	@PostMapping("/add-contact")
	public Contact addContact(@RequestBody Contact contact) {
		return repo.save(contact);
	}
}
