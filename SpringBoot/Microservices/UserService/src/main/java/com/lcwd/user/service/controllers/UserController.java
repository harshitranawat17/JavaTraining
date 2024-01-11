package com.lcwd.user.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	//create
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		User user1 = userservice.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	

	
	//single user get
	@GetMapping("/{userId}")
	//@CircuitBreaker(name = "ratingHotelBreaker",fallbackMethod = "ratingHotelFallback")
	//@Retry(name = "ratingHoteService", fallbackMethod = "ratingHotelFallback")
//	@RateLimiter(name = "UserRateLimiter", fallbackMethod = "ratingHotelFallback")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		logger.info("Get Single User Handler: UserController");
		//logger.info("Retry count: {}",retrycount);
	
		
		User user = userservice.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	//rating fallback method
	public ResponseEntity<User> ratingHotelFallback(String userId, Exception ex){
		logger.info("Fallback is executed because service is down : ", ex.getMessage());
		
        ex.printStackTrace();

        User user = User.builder()
        				.email("dummy@gmail.com")
        				.name("Dummy")
        				.about("This user is created dummy because some service is down")
        				.userId("141234")
        				.build();
        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
	}
	
	//all users get
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = userservice.getAllUsers();
		return ResponseEntity.ok(allUser);
	}
	
}
