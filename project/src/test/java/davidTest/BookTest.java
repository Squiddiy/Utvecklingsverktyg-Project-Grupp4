//package ...;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    @DisplayName("Test: Add book to ArrayList")
    public void testAdd() {
        ArrayList<Object> books = new ArrayList<Object>();
        Book book1 = new Book(1, "The Fellowship of the Ring", "J.R.R Tolkien", "High Fantasy", "01234", 111);
        books.add(book1);
    }
}