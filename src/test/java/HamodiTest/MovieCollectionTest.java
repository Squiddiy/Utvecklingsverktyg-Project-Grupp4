package HamodiTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Hamodi.Movie;
import Hamodi.MovieCollection;
import Hamodi.MovieNotFoundException;

public class MovieCollectionTest {

	private MovieCollection mc;
	private Movie movie;

	public MovieCollectionTest() {
		mc = new MovieCollection();
		movie = new Movie(1, "The Godfather", "Francis Ford Coppola", 9.2);
		mc.addMovie(movie);
	}

	@Test
	public void testEqualMovie() {
		movie = new Movie(1, "The Godfather", "Francis Ford Coppola", 9.2);
		// Movie movie2 = new Movie(2,"The Dark Knight","Christopher Nolan", 9.0);
		// Movie movie3 = new Movie(3, "The Lord of the Rings", "Peter Jackson", 8.8);
		// Movie movie4 = new Movie(4, "Inception", "Christopher Nolan", 8.8);

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
			Movie movie2 = mc.findMovie("The GodFather");
			assertEquals(movie, movie2);
		} catch (MovieNotFoundException e) {
			fail();
		}

	}

	@Test
	public void testFindMovieIgnoringCase() {
		try {
			Movie movie2 = mc.findMovie(" The GodFather ");
			assertEquals(movie, movie2);
		} catch (MovieNotFoundException e) {
			fail();
		}

	}

	@Test
	public void testFindMovieWithExtraSpaces() {
		try {
			Movie movie2 = mc.findMovie(" The GodFather ");
			assertEquals(movie, movie2);
		} catch (MovieNotFoundException e) {
			fail();
		}
	}
}