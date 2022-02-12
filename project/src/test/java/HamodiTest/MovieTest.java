package HamodiTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Hamodi.Movie;
import Hamodi.MovieCollection;

public class MovieTest {

    private MovieCollection mc;
	private Movie movie;
    
	public void MovieCollection() {
        
    
        @Test
        public void testEquals() {
            Movie movie1 = new Movie(0,null,null,0);
            Movie movie2 = new Movie(0,null,null,0);
            
            assertTrue(movie1.equals(movie2));
        }
        
        
        @Test
        public void testFindMovieIgnoringCase() {
            
            
        }
        
        @Test
    	public void testNontEqualmovie() {
        	Movie Movie1 = new Movie(0,null,null,0);
        	Movie Movie2 = new Movie(0,null,null,0);
    		
    		assertFalse(Movie1.equals(Movie2));
    }
}