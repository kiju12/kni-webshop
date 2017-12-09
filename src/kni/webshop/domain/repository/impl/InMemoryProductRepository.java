package kni.webshop.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kni.webshop.domain.Product;
import kni.webshop.domain.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository {
	// Tutaj moze byc na przyklad pobieranie danych z bazy za pomocą Hibernate'a,
	// lub w innej lepiej nieco nazwanej klasie
	List<Product> allproducts = new ArrayList<>();

	public InMemoryProductRepository() {
		Product wino = new Product("0001", "Mocna wisniax", new BigDecimal(4));
		wino.setCategory("Tanie Wina");
		wino.setCondition("Pelne");
		wino.setDescription("Dobre, bo Dobre i tanie");
		wino.setManufacturer("Amarena");
		wino.setUnitsInStock(500);

		Product woda = new Product("0002", "Zubroweczkax", new BigDecimal(19));
		woda.setCategory("Mocne");
		woda.setCondition("Pelna");
		woda.setDescription("Pali ryja, ryje beret");
		woda.setManufacturer("Mozgojeb S.p. z. o. o.");
		woda.setUnitsInStock(1000);

		Product browar = new Product("0003", "Zubrx", new BigDecimal(2));
		browar.setCategory("Soczki");
		browar.setCondition("W polowie upite");
		browar.setDescription("Siki");
		browar.setManufacturer("Nieznany");
		browar.setUnitsInStock(10000);

		allproducts.add(wino);
		allproducts.add(woda);
		allproducts.add(browar);

	}

	@Override
	public List<Product> getAllProducts() {
		return allproducts;
	}

	public Product getProductById(String productId) {   
		Product productById = null;   
		for(Product product : allproducts) {      
			if(product!=null && product.getProductId()!=null &&     
					product.getProductId().equals(productId)){ 
				productById = product; 
				break;      
				}   
			}   
		if(productById == null){     
				throw new IllegalArgumentException("Brak produktu o wskazanym id:     "+ productId);  
			}   
		return productById; 
	}

}
