package com.sample.api;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.dao.MovieDao;
import com.sample.model.Movie;

@RestController
@RequestMapping(path="/movies")
public class MoviesController {
	MovieDao movieDao = new MovieDao();
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public @ResponseBody HashMap<Integer, String> GetAllMovies() {
		
		return movieDao.Get();
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	public @ResponseBody Movie GetMovieById(@PathVariable("id") int id) {
		return movieDao.Get(id);
	}
}
