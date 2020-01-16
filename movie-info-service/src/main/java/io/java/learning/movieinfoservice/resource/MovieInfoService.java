package io.java.learning.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.java.learning.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoService {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable ("movieId") String movieId) {
		
		return new Movie(movieId, "Tes Name");
		
	}
}
