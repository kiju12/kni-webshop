package kni.webshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kni.webshop.service.CustomerService;

@Controller
public class CustomersController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public String listCustomers(Model model) {

		model.addAttribute("customers", customerService.getAllCustomers());
	
		return "customers";
	}

}