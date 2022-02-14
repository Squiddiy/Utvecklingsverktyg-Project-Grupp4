package david;

public class Book {

    private int id;
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private int noOfPages;

    public Book(int id, String title, String author, String genre, String isbn, int noOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.noOfPages = noOfPages;
    }
    public String getTitle()
    {
    	return title;
    }
}