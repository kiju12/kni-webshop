package kni.webshop.domain.repository;

import java.util.List;

import kni.webshop.domain.Customer;

public interface CustomerRepository {

	public List<Customer> getAllCustomers();
	public Customer getCustomerById(String customerId);
}
