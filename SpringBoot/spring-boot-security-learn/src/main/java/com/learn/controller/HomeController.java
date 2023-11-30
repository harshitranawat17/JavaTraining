package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {
	
	
	
	//sample home
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//sample home
	@GetMapping("/login")
	public String login() {
		return "this is login page";
	}
		
	//sample home
	@GetMapping("/register")
	public String register() {
		return "this is register page";
	}

}
