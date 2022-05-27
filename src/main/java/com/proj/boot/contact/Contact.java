package com.proj.boot.contact;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	@Id
	private int contactId;
	private String phone;
	private String addressLine_1;
	private String addressLine_2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	public Contact(int contactId, String phone, String addressLine_1, String addressLine_2, String city, String state,
			String postalCode, String country) {
		super();
		this.contactId = contactId;
		this.phone = phone;
		this.addressLine_1 = addressLine_1;
		this.addressLine_2 = addressLine_2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}
	public Contact() {
		super();
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddressLine_1() {
		return addressLine_1;
	}
	public void setAddressLine_1(String addressLine_1) {
		this.addressLine_1 = addressLine_1;
	}
	public String getAddressLine_2() {
		return addressLine_2;
	}
	public void setAddressLine_2(String addressLine_2) {
		this.addressLine_2 = addressLine_2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
