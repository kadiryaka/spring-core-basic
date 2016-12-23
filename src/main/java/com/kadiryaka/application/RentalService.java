package com.kadiryaka.application;

import com.kadiryaka.bean.Product;

public class RentalService {

	private Product product;
	private Product product2;
	
	public RentalService(Product product) {
		this.product = product;
		System.out.println("Running Rental Service constructor : product");
	}
	
	public RentalService(Product product, Product product2) {
		this.product = product;
		this.product2 = product2;
		System.out.println("Running Rental Service constructor : product & product2");
	}
}
