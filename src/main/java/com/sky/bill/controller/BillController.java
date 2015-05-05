package com.sky.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.bill.beans.Bill;
import com.sky.bill.service.BillService;

@Controller
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	public BillController() {
		
	}

	public BillController(BillService billService) {
		this.billService = billService;
	}

	@RequestMapping(value = "/bill.json", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Bill getBill() {
		return billService.getBill();
	}

    @RequestMapping("/layout")
    public String getBillPartialPage() {
        return "bill/layout";
    }
}