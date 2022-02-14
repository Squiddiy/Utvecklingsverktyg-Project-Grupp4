package Hamodi;

import java.util.ArrayList;

public class MovieCollection {
    
    private ArrayList<Movie> movie = new ArrayList<Movie>();
    private int nextPosition = 0;

    public ArrayList<Movie> getMovie() {
		return movie;
	}
	
	public int getNumberOfMovie() {
		return nextPosition;
	}
	
	public void addMovie(Movie movie) {
		this.movie.add(movie);
		nextPosition++;
	}
	
	public Movie findMovie(String name) throws MovieNotFoundException
	{
		name = name.trim();
		
		for (int counter = 0; counter < nextPosition; counter++) {
			if (movie.get(counter).getName().equalsIgnoreCase(name)) {
				return movie.get(counter);
			}
		}
		throw new MovieNotFoundException();
	}
}
