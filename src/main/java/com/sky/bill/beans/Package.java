package com.sky.bill.beans;

import java.util.List;

public class Package {
	private List<Subscription> subscriptions;
	private Double total;
	
	public Package() {
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
