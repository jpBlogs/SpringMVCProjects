package com.sample.model;

public class Movie {
	private int id;
	private double rating;
	private String name;
	private String director;
	private String genre;
	
	public Movie(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Movie(int id, double rating, String name, String director, String genre) {
		super();
		this.id = id;
		this.rating = rating;
		this.name = name;
		this.director = director;
		this.genre = genre;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
