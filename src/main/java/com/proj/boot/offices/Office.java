package com.proj.boot.offices;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="offices")
public class Office {
	@Id
	private int officeCode;
	private String territory;
	public Office(int officeCode, String territory) {
		super();
		this.officeCode = officeCode;
		this.territory = territory;
	}
	public Office() {
		super();
	}
	public int getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
	}
	public String getTerritory() {
		return territory;
	}
	public void setTerritory(String territory) {
		this.territory = territory;
	}
	@Override
	public String toString() {
		return "Office [officeCode=" + officeCode + ", territory=" + territory + "]";
	}
	
}
