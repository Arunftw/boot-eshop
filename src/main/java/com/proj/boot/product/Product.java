package com.proj.boot.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	private String productCode;
	private String productName;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private int quantityInStock;
	private double buyPrice;
	private double msrp;
	public Product(String productCode, String productName, String productScale, String productVendor,
			String productDescription, int quantityInStock, double buyPrice, double msrp) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
	}
	public Product() {
		super();
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductScale() {
		return productScale;
	}
	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public double getMsrp() {
		return msrp;
	}
	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}
	@Override
	public String toString() {
		return String.format(
				"Product [productCode=%s, productName=%s, productScale=%s, productVendor=%s, productDescription=%s, quantityInStock=%d, buyPrice=%f, msrp=%f]",
				productCode, productName, productScale, productVendor, productDescription, quantityInStock, buyPrice,
				msrp);
	}
	
	
}
