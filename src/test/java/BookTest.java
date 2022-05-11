import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Sister Outsider", "Audre Lorde", "speech");
    }

    @Test
    public void hasTitle(){
        assertEquals("Sister Outsider", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Audre Lorde", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("speech", book.getGenre());
    }

}
