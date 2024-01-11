package com.lcwd.rating.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repository.RatingRepository;
import com.lcwd.rating.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	
	@Autowired
	private RatingRepository ratingRepository;
	
	Logger logger = LoggerFactory.getLogger(RatingServiceImpl.class);
	
	@Override
	public Rating create(Rating rating) {
		
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatinByUserId(String userId) {
		logger.info("Rating serviceImpl is called +++++++++++++++++++++++++++++++++++++++++");
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		logger.info("Rating serviceImpl is called +++++++++++++++++++++++++++++++++++++++++");
		return ratingRepository.findByHotelId(hotelId);
	}

}
