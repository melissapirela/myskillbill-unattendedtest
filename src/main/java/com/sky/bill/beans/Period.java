package com.sky.bill.beans;

import java.util.Date;

public class Period {
	private Date from;
	private Date to;
	
	public Period() {
	}
	
	public Date getFrom() {
		return from;
	}
	
	public void setFrom(Date from) {
		this.from = from;
	}
	
	public Date getTo() {
		return to;
	}
	
	public void setTo(Date to) {
		this.to = to;
	}
}
