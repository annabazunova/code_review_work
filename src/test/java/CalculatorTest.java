import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(13, calculator.add(7, 6));
        assertEquals(-9, calculator.add(5, -14));
    }

    @Test
    void dif() {
        assertEquals(11, calculator.dif(15, 4));
        assertEquals(-5, calculator.dif(0, 5));
    }

    @Test
    void div() {
        assertEquals(13, calculator.div(143, 11));
        assertEquals(0, calculator.div(7, 0));
    }

    @Test
    void times() {
        assertEquals(143, calculator.times(13, 11));
        assertEquals(0, calculator.times(3, 0));
    }

    @Test
    void solver() {
        assertEquals(3, calculator.solver()); // x + y = 1 + 2 = 3
    }
}