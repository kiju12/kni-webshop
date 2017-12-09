package kni.webshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kni.webshop.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService prods;

	@RequestMapping("/{category}")
	public String getProductsByCategory(Model model, @PathVariable("category") String productCategory) {
		model.addAttribute("products", prods.getProductsByCategory(productCategory));
		return "products";
	}

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", prods.getAllProducts());

		return "products";

	}

	@RequestMapping("/all")
	public ModelAndView allProds() {
		// model.addAttribute("products", prods.getAllProducts());
		//
		// return "products";

		ModelAndView mv = new ModelAndView();
		mv.addObject("products", prods.getAllProducts());
		mv.setViewName("products");

		return mv;
	}

}
