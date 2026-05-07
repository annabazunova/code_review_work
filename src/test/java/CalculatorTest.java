import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
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
        assertEquals(12, calculator.div(144, 12));
        assertEquals(0, calculator.div(10, 0)); // обработка деления на 0 по логике вашего класса
    }

    @Test
    void times() {
        assertEquals(120, calculator.times(12, 10));
        assertEquals(0, calculator.times(5, 0));
    }

    @Test
    void solver() {
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