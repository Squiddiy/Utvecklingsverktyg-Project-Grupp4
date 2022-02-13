import david.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "The Fellowship of the Ring", "J.R.R Tolkien", "High Fantasy", "01234", 111);
        Book book2 = new Book(2, "Dune", "Frank Herbert", "Science Fiction", "43210", 222);
        Book book3 = new Book(3, "A Knight of the Seven Kingdoms", "George R.R. Martin", "Dark Fantasy", "56789", 333);
        Book book4 = new Book(4, "The Blade Itself", "Joe Abercrombie", "Dark Fantasy", "98765", 444);
    
        ArrayList<Object> books = new ArrayList<Object>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }
}
