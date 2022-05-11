import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(1 0);
        book = new Book("Song of Solomon", "Toni Morrison", "novel");
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.booksStored());

    }

}
