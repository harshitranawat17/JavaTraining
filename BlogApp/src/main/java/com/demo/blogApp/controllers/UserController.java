package com.demo.blogApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.blogApp.Security.JwtAuthenticationFilter;
import com.demo.blogApp.Security.JwtTokenHelper;
import com.demo.blogApp.payloads.ApiResponse;
import com.demo.blogApp.payloads.UserDto;
import com.demo.blogApp.services.UserService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;

@RestController
@SecurityRequirement(name = "Blog Application")
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private UserService userService;

	//create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){
		UserDto createdUserdto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createdUserdto,HttpStatus.CREATED);
	}
	
	//update user
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable("userId") Integer userId){
		
		UserDto updatedUser = this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updatedUser);
	}
	
	//delete user
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer userId){
		
		this.userService.DeleteUser(userId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true),HttpStatus.OK);
	}
	
//	//get single user	
//	@GetMapping("/{userId}")
//	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") Integer userId){
//	
//		return ResponseEntity.ok(this.userService.getUserById(userId));
//	}
	
	//get all user
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers(){
			
		return ResponseEntity.ok(this.userService.getAllUsers());
	}
	
	
	//get single user	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") Integer userId, Authentication authentication){
	
		if(authentication != null && authentication.isAuthenticated()){
	        // Check if the authenticated user has the ADMIN role
	        if(authentication.getAuthorities().stream().anyMatch(r -> r.getAuthority().equals("ROLE_ADMIN"))) {
	            // Admin can access any user's data
	            return ResponseEntity.ok(this.userService.getUserById(userId));
	        } else {
	        	String usrnm = jwtAuthenticationFilter.getusernames();
	    		UserDto dto =  userService.getUserById(userId);
	    		if(usrnm != null) {
	    			if(usrnm.equals(dto.getEmail())) {
	    				return ResponseEntity.ok(this.userService.getUserById(userId));
	    			}else {
	                    // Return Forbidden status if the token's username doesn't match the requested user's username
	                    return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	                }
	            } else {
	                // Return Unauthorized status if UserDetails is null (token is invalid)
	                return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    		}
	        }
		}else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
		
		
		
	}
	
}

