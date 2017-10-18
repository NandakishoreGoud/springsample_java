package com.pluralsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsite.model.Customer;
import com.pluralsite.repository.CustomerRepository;
import com.pluralsite.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired ----
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("we are using constructor injection ");
		this.customerRepository = customerRepository;
	}
	
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("wer are using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
return customerRepository.findAll();
	}
}
