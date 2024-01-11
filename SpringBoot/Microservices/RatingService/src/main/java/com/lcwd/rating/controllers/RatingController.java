package com.lcwd.rating.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	Logger logger = LoggerFactory.getLogger(RatingController.class);
	
	//create rating
	@PreAuthorize("hasAuthority('Admin')")
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
	
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	
	}
	
	//get all
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
		return ResponseEntity.ok(ratingService.getRatings());
	}
	
	
	
	//get rating by user id
	@GetMapping("/users/{userId}")
//	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		logger.info("Inside get Ratings By User ID Method of RatingController******************************");
		return ResponseEntity.ok(ratingService.getRatinByUserId(userId));
	}
	
	//get rating by hotel id
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		logger.info("Inside get Ratings By Hotel ID Method of RatingController******************************");
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}
	
	
}

