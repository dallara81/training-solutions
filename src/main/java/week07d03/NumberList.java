package week07d03;
// A week07d03 csomagban hozz létre egy NumberList osztályt. Ennek legyen egy metódusa isIncreasing(List<Integer>)
// mely egy számokból álló listát vár paraméterül és megnézi, hogy a listában a számok növekvő sorrendben szerepelnek-e
// és ennek megfelelően igaz vagy hamis értékkel tér vissza. Speciális eset ha két egymást követő szám egyenlő,
// ez nem probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük.

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> x){
        int currentX=x.get(0);
        for(int y:x){
            if (y < currentX){
                return false;
            }
            currentX=y;
        }
        return true;
    }
}