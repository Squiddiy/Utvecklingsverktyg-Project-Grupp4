//package 

import java.beans.Transient;

import org.junit.Test;

public class MovieCollectionTest {

    private MovieCollection mc;
    private Movie movie1;

    public MovieCatalogTest() {
		mc = new MovieCatalog();
		Movie movie1 = new Movie(1,"The Godfather","Francis Ford Coppola", 9.2)
		mc.addMovie(movie1);

    @Test
    public void testEqualMovie () {
        Movie movie1 = new Movie(1,"The Godfather","Francis Ford Coppola", 9.2);
        //Movie movie2 = new Movie(2,"The Dark Knight","Christopher Nolan", 9.0);
        //Movie movie3 = new Movie(3, "The Lord of the Rings", "Peter Jackson", 8.8);
        //Movie movie4 = new Movie(4, "Inception", "Christopher Nolan", 8.8);

        
}

    @Test
	public void testAddAMovie() {
    	Movie movie2 = new Movie(2, "The Dark Knight", "Christopher Nolan", 9.0);
		mc.addMovie(movie2);
		
		assertnotnull(movie2);

		@Test
		public void testFindMovie() {
			try {
				mc.findMovie("The Dark Knight");
			} catch (MovieNotFoundException e) {
				System.out.println("error");
			}
			
		}
		@Test
		public void testFindMovieIgnoringCase() {
			try {
				mc.findMovie(" The Dark Knight ");
			} catch (MovieNotFoundException e) {
				System.out.println("error");
			}

		}

		@Test
		public void testFindMovieWithExtraSpaces() {
			try {
				mc.findMovie(" The Dark Knight ");
			} catch (BookNotFoundException e) {
				System.out.println("error");
			}








}