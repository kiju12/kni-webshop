package kni.webshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kni.webshop.domain.Customer;
import kni.webshop.domain.repository.CustomerRepository;
import kni.webshop.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository clients;

	@Override
	public List<Customer> getAllCustomers() {

		return clients.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(String customerId) {
		return clients.getCustomerById(customerId);
	}

}
