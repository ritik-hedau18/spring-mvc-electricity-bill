package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BillController {
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
		
	}
	
	@RequestMapping("billPage")
	public String billPage() {
		
		return "billCalculator";
		
	}
	
	@RequestMapping("calculateBill")
	public String calculateBill(@RequestParam ("name") String name,
			@RequestParam("unit") double unit, Model model) {
		
		double amount;
		
		if(unit>= 0 && unit<=100) {
			
			 amount = unit * 5;
			
		} else if (unit >=101 && unit <=200) {
			
			 amount = unit * 7;
			
		} else {
			
			 amount = unit * 10;
			
		}
		
		model.addAttribute("name", name);
		model.addAttribute("unit", unit);
		model.addAttribute("amount", amount);
		
		
		return "result";
		
	}
	

}
