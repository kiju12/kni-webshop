package kni.webshop.controllers;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kni.webshop.domain.Product;

@Controller
public class ProductController {

	@RequestMapping("/products")
	public String list(Model model) {
		Product wino = new Product("0001", "Mocna wisnia", new BigDecimal(19));
		wino.setCategory("Tanie wina");
		wino.setCondition("W polowie dopite");
		wino.setManufacturer("Amarena");
		wino.setUnitsInStock(500);
		
		model.addAttribute("winko", wino);
		
		return "products";
		
	}
	
	
	
	
}
