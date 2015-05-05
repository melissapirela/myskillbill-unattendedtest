package com.sky.bill.beans;

import java.util.List;

public class SkyStore {
	private List<Movie> rentals;
	private List<Movie> buyAndKeep;
	private Double total;
	
	public SkyStore() {
	}

	public List<Movie> getRentals() {
		return rentals;
	}

	public void setRentals(List<Movie> rentals) {
		this.rentals = rentals;
	}

	public List<Movie> getBuyAndKeep() {
		return buyAndKeep;
	}

	public void setBuyAndKeep(List<Movie> buyAndKeep) {
		this.buyAndKeep = buyAndKeep;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
