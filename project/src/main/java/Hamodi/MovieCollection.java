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
		movie.add = movie;
		nextPosition++;
	}
	
	public void findMovie(String title) throws MovieNotFoundException
	{
		title = title.trim();
		
		for (int counter = 0; counter < nextPosition; counter++) {
			if (MovieArray[counter].getTitle().equalsIgnoreCase(title)) {
				return MovieArray[counter];
			}
		}
		throw new MovieNotFoundException();
	}
}
