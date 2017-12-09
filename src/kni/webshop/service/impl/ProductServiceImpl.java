package kni.webshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kni.webshop.domain.Product;
import kni.webshop.domain.repository.ProductRepository;
import kni.webshop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prods;
	
	@Override
	public List<Product> getAllProducts() {
		
		return prods.getAllProducts();
		
	}
	
	@Override
	public List<Product> getProductsByCategory(String category){
		return prods.getProductByCategory(category);
	}
}
