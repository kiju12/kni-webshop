package kni.webshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kni.webshop.domain.Product;
import kni.webshop.domain.repository.ProductRepository;
import kni.webshop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ProductRepository prods;
	
	@Override
	public void processOrder(String productId, int count) {
		
		Product product = prods.getProductById(productId);
		
		if(product.getUnitsInStock() < count) {
			throw new IllegalArgumentException("Zbyt mala liczba towaru. Obecna ilosc sztuk w magazynie: " 
					+ product.getUnitsInStock());
		} else {
			product.setUnitsInStock(product.getUnitsInStock() - count);
		}
		
	}

}
