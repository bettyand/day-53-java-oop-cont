import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book myBook = new Book("I Need a Vacation", 420, 1969);

    @Test
    void testGetTitle() {
        assertEquals("I Need a Vacation", myBook.getTitle());
    }

    @Test
    void testGetNumPages() {
        assertEquals(420, myBook.getNumPages());
    }

    @Test
    void testGetPubYear() {
        assertEquals(1969, myBook.getPubYear());
    }
}