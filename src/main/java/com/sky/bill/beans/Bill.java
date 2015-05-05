package com.sky.bill.beans;

public class Bill {

	private Statement statement;
	private Double total;
	private Package skyPackage;
	private CallCharge callCharges;
	private SkyStore skyStore;
	
	public Bill() {
	}
	
	public Statement getStatement() {
		return statement;
	}
	
	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Package getPackage() {
		return skyPackage;
	}
	
	public void setPackage(Package skyPackage) {
		this.skyPackage = skyPackage;
	}
	
	public CallCharge getCallCharges() {
		return callCharges;
	}
	
	public void setCallCharges(CallCharge callCharges) {
		this.callCharges = callCharges;
	}
	
	public SkyStore getSkyStore() {
		return skyStore;
	}
	
	public void setSkyStore(SkyStore skyStore) {
		this.skyStore = skyStore;
	}
}