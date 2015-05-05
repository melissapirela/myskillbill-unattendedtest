package com.sky.bill.beans;

import java.util.List;

public class CallCharge {
	private List<Call> calls;
	private Double total;
	
	public CallCharge() {
	}
	
	public List<Call> getCalls() {
		return calls;
	}
	
	public void setCalls(List<Call> calls) {
		this.calls = calls;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
}
