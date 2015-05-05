package com.sky.bill.service;

import org.springframework.stereotype.Service;

import com.sky.bill.beans.Bill;

@Service
public interface BillService {
	
	Bill getBill();
	
}
