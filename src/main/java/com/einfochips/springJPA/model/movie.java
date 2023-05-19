package com.einfochips.springJPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class movie {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int movieId;
	private String moviename;
	private String director;
	private String language;
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public movie(int movieId, String moviename, String director, String language) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
		this.director = director;
		this.language = language;
	}
	public movie() {
		super();
		
	}
	@Override
	public String toString() {
		return "movie [movieId=" + movieId + ", moviename=" + moviename + ", director=" + director + ", language="
				+ language + "]";
	}
	
	
}
