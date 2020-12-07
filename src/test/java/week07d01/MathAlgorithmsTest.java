package week07d01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {


    @Test
    void isPrimeMinus() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(-2));
        assertEquals("A megadott számnak nagyobbnak kell lennie, mint nulla!", iae.getMessage());

    }

    @Test
    void isPrimeZero() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(0));
        assertEquals("A megadott számnak nagyobbnak kell lennie, mint nulla!", iae.getMessage());

    }

    @Test
    void isPrime2() {
        assertTrue(MathAlgorithms.isPrime(2));
        assertTrue(MathAlgorithms.isPrime(3));
        assertTrue(MathAlgorithms.isPrime(5));
        assertTrue(MathAlgorithms.isPrime(7));
        assertTrue(MathAlgorithms.isPrime(11));
        assertTrue(MathAlgorithms.isPrime(13);
        assertTrue(MathAlgorithms.isPrime(17));
        assertTrue(MathAlgorithms.isPrime(19));
        assertTrue(MathAlgorithms.isPrime(23));
        assertTrue(MathAlgorithms.isPrime(29));
        assertTrue(MathAlgorithms.isPrime(31));
        assertTrue(MathAlgorithms.isPrime(37));
        assertTrue(MathAlgorithms.isPrime(41));
        assertTrue(MathAlgorithms.isPrime(43));
        assertTrue(MathAlgorithms.isPrime(47));
        assertTrue(MathAlgorithms.isPrime(53));
        assertTrue(MathAlgorithms.isPrime(59));
        assertTrue(MathAlgorithms.isPrime(61));
        assertTrue(MathAlgorithms.isPrime(67));

    }
}