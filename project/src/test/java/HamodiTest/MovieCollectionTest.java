package HamodiTest;

import java.beans.Transient;

import static org.junit.Assert.*;

import org.junit.Test;

import Hamodi.Movie;
import Hamodi.MovieCollection;

public class MovieCollectionTest {

    private MovieCollection mc;
    private Movie movie;

    public MovieCollectionTest() {
		mc = new MovieCollection();
		movie = new Movie(1,"The Godfather","Francis Ford Coppola", 9.2);
		mc.addMovie(movie);
	}
    @Test
    public void testEqualMovie () {
        movie = new Movie(1,"The Godfather","Francis Ford Coppola", 9.2);
        //Movie movie2 = new Movie(2,"The Dark Knight","Christopher Nolan", 9.0);
        //Movie movie3 = new Movie(3, "The Lord of the Rings", "Peter Jackson", 8.8);
        //Movie movie4 = new Movie(4, "Inception", "Christopher Nolan", 8.8);

        
}

    @Test
	public void testAddAMovie() {
    	Movie movie2 = new Movie(2, "The Dark Knight", "Christopher Nolan", 9.0);
		mc.addMovie(movie2);
		
		assertNotNull(movie2);
	}
		@Test
		public void testFindMovie() {
			try {
				mc.findMovie("The Dark Knight");
				assertEquals.movie(movie2);
			} catch (MovieNotFoundException e) {
				System.out.println("error");
			}
			
		}
		@Test
		public void testFindMovieIgnoringCase() {
			try {
				mc.findMovie(" The Dark Knight ");
				assertEquals.movie(movie2);
			} catch (MovieNotFoundException e) {
				System.out.println("error");
			}

		}

		@Test
		public void testFindMovieWithExtraSpaces() {
			try {
				mc.findMovie(" The Dark Knight ");
				assertEquals.movie(movie2);
			} catch (BookNotFoundException e) {
				System.out.println("error");
			}








}