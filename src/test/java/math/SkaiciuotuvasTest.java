package math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SkaiciuotuvasTest {

    @Test
    public void testAdd() {
        int suma = Skaiciuotuvas.add(5, 5);
        assertEquals(10, suma);
    }

    @Test
    public void testMinus() {
        int atimtis = Skaiciuotuvas.minus(5, 5);
        Assertions.assertEquals(0, atimtis);
    }

    @Test
    public void testDivision() {
        int dalyba = Skaiciuotuvas.division(5, 5);
        ArithmeticException arithmeticException =
                assertThrows(ArithmeticException.class, () -> Skaiciuotuvas.division(10,0));

        assertEquals("/ by zero", arithmeticException.getMessage());
    }
}
