package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.learn.model.User;
import com.learn.repo.UserRepository;

@SpringBootApplication
public class SpringBootSecurityLearnApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootSecurityLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("john");
		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
		user.setEmail("john@gmail.com");
		user.setRole("ROLE_NORMAL");
		
		this.userRepository.save(user);
		
		User user1 = new User();
		user1.setUsername("harry");
		user1.setPassword(this.bCryptPasswordEncoder.encode("xyz"));
		user1.setEmail("harry@gmail.com");
		user1.setRole("ROLE_ADMIN");
		
		this.userRepository.save(user1);
		
	}

}
