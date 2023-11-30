package com.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	public User findByUsername(String username);

}
