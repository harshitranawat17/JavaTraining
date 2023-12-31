package com.springboot.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.dto.AuthReq;
import com.springboot.security.entity.Employee;
import com.springboot.security.service.EmpService;

@RestController
@RequestMapping("/employees")
public class EmpController {

	@Autowired
	private EmpService empService;
	@Autowired
	private JWTService jwtService;

	@GetMapping("/get")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Employee> getAllEmployee() {
		List<Employee> list = empService.getAllEmployee();
		return list;
	}

	@GetMapping("/{username}")

	public Optional<Employee> getByUsername(@PathVariable("username") String username) {
		return empService.getEmployee(username);

	}

	@PostMapping("/new")
	public String addEmployee(@RequestBody Employee employee) {
		return empService.addUser(employee);
	}
	//for jwt authentication 
	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody AuthReq authreq) {
	retur jwtService.generateToken(authreq.getUsername());
	
	}

}
