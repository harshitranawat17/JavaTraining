package com.springboot.security.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.springboot.security.entity.Employee;
import com.springboot.security.repository.EmpRepository;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {
	@Autowired
	private EmpRepository empRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Employee> emp = empRepository.findByUsername(username);
		return emp.map(UserInfoUserDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException("user not found " + username));

	}
}
