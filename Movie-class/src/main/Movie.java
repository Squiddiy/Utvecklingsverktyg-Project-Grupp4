import java.util.ArrayList;

public class Movie {

    private int id;
    private String name;
    private String director;
    private double rating;

    public Movie(int id, String name, String director, double rating) {
        this.id=id;
        this.name = name;
        this.director = director;
        this.rating = rating;
    }
    
    //public static void main(String[] args) {
        
    Movie movie1 = new Movie(1, "The Godfather", "Francis Ford Coppola", 9.2);
    Movie movie2 = new Movie(2, "The Dark Knight", "Christopher Nolan", 9.0);
    Movie movie3 = new Movie(3, "The Lord of the Rings", "Peter Jackson", 8.8);
    Movie movie4 = new Movie(4, "Inception", "Christopher Nolan", 8.8);
    
    
    ArrayList<Movie> movies = new ArrayList<Movie>();
    movies.add(movie1);
    movies.add(movie2);
    movies.add(movie3);
    movies.add(movie4);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

