package kni.webshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import kni.webshop.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService prods;

	@RequestMapping("/products")
	public String list(Model model) {
		model.addAttribute("products", prods.getAllProducts());

		return "products";

	}

}
