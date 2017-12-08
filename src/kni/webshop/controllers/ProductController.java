package kni.webshop.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kni.webshop.domain.Product;
import kni.webshop.domain.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository prods;
	
	
	@RequestMapping("/products")
	public String list(Model model) {
		model.addAttribute("products", prods.getAllProducts());
		
		return "products";
		
	}
	
	
	
	
}
