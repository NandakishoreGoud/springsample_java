package com.pluralsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsite.model.Customer;
import com.pluralsite.repository.CustomerRepository;
import com.pluralsite.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {};
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("we are using constructor injection");
		this.customerRepository = customerRepository;
	}
	public void setCustomerRepository(CustomerRepository customerRepository) {
		
		System.out.println("we are using seter injection");this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll(){
return customerRepository.findAll();
	}
}
