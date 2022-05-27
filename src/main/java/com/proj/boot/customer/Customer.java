package com.proj.boot.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	private int customerNumber;
	private String customerName;
	private String contactLastName;
	private String contactFirstName;
	private int salesRep;
	private double creditLimit;
	public Customer(int customerNumber, String customerName, String contactLastName, String contactFirstName,
			int salesRep, double creditLimit) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.salesRep = salesRep;
		this.creditLimit = creditLimit;
	}
	public Customer() {
		super();
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public int getSalesRep() {
		return salesRep;
	}
	public void setSalesRep(int salesRep) {
		this.salesRep = salesRep;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", contactLastName="
				+ contactLastName + ", contactFirstName=" + contactFirstName + ", salesRep=" + salesRep
				+ ", creditLimit=" + creditLimit + "]";
	}
	
	
	
}
