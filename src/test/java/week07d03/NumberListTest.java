package week07d03;
// A week07d03 csomagban hozz létre egy NumberList osztályt. Ennek legyen egy metódusa isIncreasing(List<Integer>)
// mely egy számokból álló listát vár paraméterül és megnézi, hogy a listában a számok növekvő sorrendben szerepelnek-e
// és ennek megfelelően igaz vagy hamis értékkel tér vissza. Speciális eset ha két egymást követő szám egyenlő,
// ez nem probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük.

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberListTest {

    @Test
    void isIncreasing() {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        NumberList nrl = new NumberList();
        assertTrue(nrl.isIncreasing(intList));

        intList = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6));
        assertTrue(nrl.isIncreasing(intList));

        intList = new ArrayList<>(Arrays.asList(1,1,1,1,1,3,4,5,6));
        assertTrue(nrl.isIncreasing(intList));

        intList = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,4,4,6));
        assertFalse(nrl.isIncreasing(intList));

        intList = new ArrayList<>(Arrays.asList(1));
        assertTrue(nrl.isIncreasing(intList));
    }
}