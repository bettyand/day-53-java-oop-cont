import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal = new Animal("Rover", true);

    @Test
    void testGetName() {
        assertEquals("Rover", animal.getName());
    }

    @Test
    void testGetIsDog() {
        assertTrue(animal.getIsDog());
    }
}