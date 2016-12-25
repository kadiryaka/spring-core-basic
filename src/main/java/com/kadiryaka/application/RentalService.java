package com.kadiryaka.application;

import com.kadiryaka.bean.Product;

public class RentalService {

	private Product product;
	private Product product2;
	private String name;
	
	public RentalService(Product product) {
		this.product = product;
		System.out.println("Running Rental Service constructor : product");
	}
	
	public RentalService(Product product, Product product2) {
		this.product = product;
		this.product2 = product2;
		System.out.println("Running Rental Service constructor : product & product2");
	}
	
	public RentalService(Product product, String name) {
		this.product = product;
		this.name = name;
		System.out.println("Running Rental Service constructor : product");
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getProduct2() {
		return product2;
	}

	public void setProduct2(Product product2) {
		this.product2 = product2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
