public class MovieList {

    private movieCollection mc;
	private Movie movie;

	public MovieCollection() {
		mc = new movieCollection();
		movie = new Movie(1, "The Godfather", "Francis Ford Coppola", 9.2)
		mc.addmovie(movie);
    
    }

        @Test
        public void testFindMovie() {
            try {
                mc.findMovie("The Godfather");
            } catch (MovieNotFoundException e) {
                System.out.println("error");
            }
        }
    
        //G
        @Test
        public void testFindMovieIgnoringCase() {
            try {
                mc.findMovie(" The Godfather ");
            } catch (MovieNotFoundException e) {
                System.out.println("error");
            }
    
        }
    
        //G
        @Test
        public void testFindMovieWithExtraSpaces() {
            try {
                bc.findMovie(" The Godfather ");
            } catch (MovieNotFoundException e) {
                System.out.println("error");
            }
        }
        
}
