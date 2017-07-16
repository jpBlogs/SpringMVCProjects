package com.sample.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.sample.model.Movie;

public class MovieDao {
	private static HashMap<Integer, String> movieList;
	private static List<Movie> movieDetails;
	static {
		movieDetails = new ArrayList<Movie>();
		movieDetails.add(new Movie(1, 8.3, "Batman Begins", "Christopher Nolan", "Action, Adventure"));
		movieDetails.add(new Movie(2, 8.0, "Casino Royale", "Martin Campbell", "Action, Adventure, Thriller"));
		movieDetails.add(new Movie(3, 7.9, "Iron Man", "Jon Favreau", "Action, Adventure, Sci-Fi"));
		movieDetails.add(new Movie(4, 7.1, "Transformers", "Michael Bay", "Action, Adventure, Sci-Fi"));
		movieDetails.add(new Movie(5, 7.8, "The Hangover", "Todd Phillips", "Comedy"));
		movieDetails.add(new Movie(6, 6.6, "Quantum of Solace", "Marc Forster", "Action, Adventure, Thriller"));
		movieDetails.add(new Movie(7, 6.9, "Captain America: The First Avenger ", "Joe Johnston", "Action, Adventure, Sci-Fi"));
		movieDetails.add(new Movie(8, 7.0, "Thor", "Kenneth Branagh", "Action, Adventure, Fantasy, Sci-Fi"));
		movieDetails.add(new Movie(9, 6.8, "The Incredible Hulk", "Louis Leterrier", "Action, Adventure, Sci-Fi"));
		movieDetails.add(new Movie(10, 8.1, "Spotlight", "Tom McCarthy", "Crime, Drama, History"));
		movieDetails.add(new Movie(11, 7.7, "Argo", "Ben Affleck", "Biography, Drama, History, Thriller"));
		
		movieList = new HashMap<Integer, String>();
		for(Movie movie : movieDetails) {
			movieList.put(movie.getId(), movie.getName());
		}
	}
	
	public HashMap<Integer, String> Get(){
		return movieList;
	}
	
	public Movie Get(int id) {
		return movieDetails.stream().filter(movie -> movie.getId() == id).findFirst().get();
	}
}
