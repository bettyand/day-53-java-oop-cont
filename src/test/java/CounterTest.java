import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter myCounter = new Counter();

    @Test
    void testValue() {
        assertEquals(0, myCounter.value());
    }

    @Test
    void testIncrease() {
        myCounter.increase();
        assertEquals(1, myCounter.value());
    }

    @Test
    void testIncrease2() {
        myCounter.increase(2);
        assertEquals(2, myCounter.value());
    }

    @Test
    void testDecrease() {
        myCounter.decrease();
        assertEquals(-1, myCounter.value());
    }

    @Test
    void testDecrease2() {
        myCounter.decrease(2);
        assertEquals(-2, myCounter.value());
    }
}