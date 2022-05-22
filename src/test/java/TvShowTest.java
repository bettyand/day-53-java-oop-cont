import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvShowTest {

    TvShow myShow = new TvShow("Dessert of Despair: Cooking for the Depressed Developer", 69, "self help");

    @Test
    void testGetShowName() {
        assertEquals("Dessert of Despair: Cooking for the Depressed Developer", myShow.getShowName());
    }

    @Test
    void testGetNumEpisodes() {
        assertEquals(69, myShow.getNumEpisodes());
    }

    @Test
    void testGetGenre() {
        assertEquals("self help", myShow.getGenre());
    }
}