package com.sky.bill.beans;

import java.util.Date;

public class Statement {
	private Date generated;
	private Date due;
	private Period period;
	
	public Statement() {
	}
	
	public Date getGenerated() {
		return generated;
	}
	
	public void setGenerated(Date generated) {
		this.generated = generated;
	}
	
	public Date getDue() {
		return due;
	}
	
	public void setDue(Date due) {
		this.due = due;
	}
	
	public Period getPeriod() {
		return period;
	}
	
	public void setPeriod(Period period) {
		this.period = period;
	}

}
