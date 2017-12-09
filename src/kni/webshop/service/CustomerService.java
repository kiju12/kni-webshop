package kni.webshop.service;

import java.util.List;

import kni.webshop.domain.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Customer getCustomerById(String customerId);
}
