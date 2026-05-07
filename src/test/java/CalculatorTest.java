import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

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

        assertEquals(15, calculator.add(8, 7));
        assertEquals(-3, calculator.add(5, -8));
    }

    @Test
    void diff() {
        assertEquals(10, calculator.diff(14, 4));
        assertEquals(-2, calculator.diff(3, 5));

    }

    @Test
    void div() {

        assertEquals(13, calculator.div(143, 11));
        assertEquals(0, calculator.div(7, 0));

        assertEquals(12, calculator.div(144, 12));
        assertEquals(0, calculator.div(10, 0)); // обработка деления на 0 по логике вашего класса

    }

    @Test
    void times() {

        assertEquals(143, calculator.times(13, 11));
        assertEquals(0, calculator.times(3, 0));

        assertEquals(120, calculator.times(12, 10));
        assertEquals(0, calculator.times(5, 0));

    }

    @Test
    void solver() {

        assertEquals(3, calculator.solver()); // x + y = 1 + 2 = 3

        //Два корня: x² - 5x + 6 = 0  →  корни: 3.0 и 2.0
        assertArrayEquals(new double[]{3.0, 2.0}, calculator.solver(1, -5, 6), 1e-9);

        //Один корень (дискриминант = 0): x² - 4x + 4 = 0  →  корень: 2.0
        assertArrayEquals(new double[]{2.0}, calculator.solver(1, -4, 4), 1e-9);

        //Нет действительных корней: x² + 1 = 0  →  пустой массив
        assertArrayEquals(new double[]{}, calculator.solver(1, 0, 1), 1e-9);

        //Вырожденный случай (a=0): линейное уравнение 2x - 6 = 0  →  корень: 3.0
        assertArrayEquals(new double[]{3.0}, calculator.solver(0, 2, -6), 1e-9);

    }
}