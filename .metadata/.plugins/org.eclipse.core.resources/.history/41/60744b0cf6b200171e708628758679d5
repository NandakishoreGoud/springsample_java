package com.pluralsite.service;

import java.util.List;

import com.pluralsite.model.Customer;
import com.pluralsite.repository.CustomerRepository;
import com.pluralsite.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	public CustomerServiceImpl() {
		
	}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository= customerRepository;
	}
	
	@Override
	public List<Customer> findAll(){
return customerRepository.findAll();
	}

	public void setFoo(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
