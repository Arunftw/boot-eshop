package com.proj.boot.account;

public class Account {
	private int accNo;
	private String Name;
	private double Balance;
	public int getAccNo() {
		return accNo;
	}
	
	public Account() {
		super();
	}

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		Name = name;
		Balance = balance;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", Balance=" + Balance + "]";
	}
	
	
	
}
