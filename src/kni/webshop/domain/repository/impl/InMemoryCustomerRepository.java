package kni.webshop.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kni.webshop.domain.Customer;
import kni.webshop.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	List<Customer> clientList = new ArrayList<>();
	
	public InMemoryCustomerRepository() {
		
		Customer c1 = new Customer("C01", "Maciej Kijko", "New York City");
		Customer c2 = new Customer("C02", "Krzysztof Krawczyk", "Wawa");
		Customer c3 = new Customer("C03", "Alex Kwasnieski", "Kuba");
		
		clientList.add(c1);
		clientList.add(c2);
		clientList.add(c3);
	}
	
	
	@Override
	public List<Customer> getAllCustomers() {
		return clientList;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		Customer lookedfor = null;
		
		for(Customer c : clientList) {
			if(c.getCustomerId().equals(customerId)) 
				lookedfor = c;
		}
		
		if(lookedfor == null) {
			throw new IllegalArgumentException("Brak klienta o podanym Id");
		}
		
		return lookedfor;
	}

}
