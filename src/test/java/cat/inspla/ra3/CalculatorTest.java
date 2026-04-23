package cat.inspla.ra3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    // Prova 1: suma de dos nombres positius
    @Test
    public void testAddPositius() {
        assertEquals(8, calc.add(5, 3));
    }

    // Prova 2: suma amb zero
    @Test
    public void testAddAmbZero() {
        assertEquals(7, calc.add(7, 0));
    }

    // Prova 3: suma de nombres negatius
    @Test
    public void testAddNegatius() {
        assertEquals(-6, calc.add(-2, -4));
    }

    // Prova 4: suma de positiu i negatiu
    @Test
    public void testAddPositiuNegatiu() {
        assertEquals(2, calc.add(5, -3));
    }

    // Prova divide(10,0) → ha de llançar excepció
    @Test
    public void testDividePerZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}