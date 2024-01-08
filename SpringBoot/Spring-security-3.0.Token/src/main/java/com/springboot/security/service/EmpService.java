package com.springboot.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.security.entity.Employee;
import com.springboot.security.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	private EmpRepository empRepository;
	@Autowired
	private PasswordEncoder encoder;
	// List<Employee> list = new ArrayList<>();

	public List<Employee> getAllEmployee() {
		List<Employee> empList = (List<Employee>) this.empRepository.findAll();
		return empList;
	}

	public Optional<Employee> getEmployee(String username) {
		return empRepository.findByUsername(username);

	}

	public Employee addEmployee(Employee employee) {
		empRepository.save(employee);
		return employee;
	}

	public String addUser(Employee emp) {
		emp.setPassword(encoder.encode(emp.getPassword()));
		empRepository.save(emp);
		return "employee saved";
	}

}
