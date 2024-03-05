package com.demo.blogApp.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.blogApp.entities.User;
import com.demo.blogApp.exceptions.ResourceNotFoundEception;
import com.demo.blogApp.repositories.UserRepo;

@Service
public class CustomerDetailService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//loading user from database as username(email)
		User user = this.userRepo.findByEmail(username).orElseThrow(() -> new ResourceNotFoundEception("User", "email"+username, 0));
		
		return user;
	}

}
