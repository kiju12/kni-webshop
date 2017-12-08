package kni.webshop.domain.repository;
import java.util.List;

import kni.webshop.domain.Product;

public interface ProductRepository {
		
	public Product getProductById(String id);
	public List<Product> getAllProducts();
}
