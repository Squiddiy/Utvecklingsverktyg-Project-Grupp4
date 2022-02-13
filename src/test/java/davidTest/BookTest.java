package davidTest;

import org.junit.Test;

import david.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class BookTest {
    Book book1 = new Book(1, "The Fellowship of the Ring", "J.R.R Tolkien", "High Fantasy", "01234", 111);

    @Test
    public void testAdd() {
        ArrayList<Object> books = new ArrayList<Object>();
        books.add(book1);
        assertTrue(books.contains(book1));
    }
}