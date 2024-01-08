package com.springboot.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.security.dto.AuthReq;
import com.springboot.security.entity.Employee;
import com.springboot.security.service.EmpService;
import com.springboot.security.service.JwtService;

@RestController
@RequestMapping("/employees")
public class EmpController {

	@Autowired
	private EmpService empService;
	@Autowired
	private JwtService jwtService;
	private final AuthenticationManager authenticationManager;
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

	// for jwt authentication
	@PostMapping("/authenticate")
	public String authenticateAndGetToken(@RequestBody AuthReq authreq) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(authreq.getUsername(), authreq.getPassword()));
		if (authentication.isAuthenticated()) {
			return jwtService.generateToken(authreq.getUsername());
		} else {
			throw new UsernameNotFoundException("invalid user request !");
		}

	}
	@Autowired
    public EmpController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }


}
