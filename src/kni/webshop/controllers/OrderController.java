package kni.webshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kni.webshop.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderservice;
	
	@RequestMapping("/order/0001/2")
	public String process(Model model) {
		orderservice.processOrder("0001", 2);
		return "redirect:/products";
		
	}
}
