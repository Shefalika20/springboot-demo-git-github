package io.java.learning.ratingservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.learning.ratingservice.models.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingService {

	@RequestMapping("/{movieId}")
	public Rating getRatings(@PathVariable ("movieId") String movieId) {
		
		return new Rating(movieId, 5);
	}
	
	
	
	
}
