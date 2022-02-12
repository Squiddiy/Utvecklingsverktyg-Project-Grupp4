package Hamodi;

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

