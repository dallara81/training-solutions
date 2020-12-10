package week07d4;
// Hozz létre egy week07d04.Lab nevű osztályt, ami azt tárolja el, hogy melyik feladattal készültél el.
// Három attribútuma: title ami a tananyag neve, egy completed, hogy elkészültél-e vele, és a completedAt ,
// ami azt tárolja, hogy mikor. Legyen két konstruktora!
// Az egyik csak a címet várja,
// ekkor úgy állítsa be a példányt, hogy még nem készültél el.
// Legyen egy másik, ami várja a címet és a dátumot.
// Ekkor azt állítsa be, hogy elvégezted a gyakorlati feladatot.
// Írj egy complete metódust, ami kap egy dátumot, és beállítja, hogy elvégezted a gyakorlati feladatot.
// Legyen egy complete metódusa, ami semmit nem vár, ez azt állítja be, hogy MOST végezted el a gyakorlati feladatot.
// Írd meg a toString metódusát is!

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LabTest {

    @Test
    public void complete1(){
        Lab lab = new Lab("Match");
        lab.complete(LocalDate.of(2020,12,09));
        assertEquals("Subject info: title='Match', completed=true, completedAt=2020-12-09", lab.toString());
    }

    @Test
    public void complete2(){
        Lab lab = new Lab("Match");
        lab.complete();
        assertEquals("Subject info: title='Match', completed=true, completedAt="+LocalDate.now(), lab.toString());
    }

    @Test
    public void Contructor1(){
        Lab lab = new Lab("Match");
        assertEquals("Subject info: title='Match', completed=false, completedAt=null", lab.toString());
    }

    @Test
    public void Contructor2(){
        Lab lab = new Lab("Match", LocalDate.of(2020,12,08));
        assertEquals("Subject info: title='Match', completed=true, completedAt=2020-12-08", lab.toString());
    }
}