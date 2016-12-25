package com.kadiryaka.bean;

public class HouseProduct implements Product {

	private Boolean isRental;
	
	private short floor;
	
	private Long price;

	public Boolean getIsRental() {
		return isRental;
	}

	public void setIsRental(Boolean isRental) {
		this.isRental = isRental;
	}

	public short getFloor() {
		return floor;
	}

	public void setFloor(short floor) {
		this.floor = floor;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
}
