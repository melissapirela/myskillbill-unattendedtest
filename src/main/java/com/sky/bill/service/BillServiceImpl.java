package com.sky.bill.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import com.sky.bill.beans.Bill;

@Service
public class BillServiceImpl implements BillService {
	
	public Bill getBill() {
		Bill bill = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL jsonFile = new URL("http://safe-plains-5453.herokuapp.com/bill.json").toURI().toURL();
			 
			bill = mapper.readValue(jsonFile, Bill.class);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return bill;
	}
}
