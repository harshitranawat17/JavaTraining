package com.multiple.Database.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multiple.Database.mysql.entity.Customer;
import com.multiple.Database.mysql.repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
		Customer cust = new Customer();
		cust.setAddress(customer.getAddress());
		cust.setName(customer.getName());
		cust.setId(customer.getId());
		return customerRepository.save(cust);
	}

	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
		customerRepository.deleteById(id);
	}
}
