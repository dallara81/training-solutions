package week09d03;

import java.util.List;
import java.util.ArrayList;

public class SantaClaus {
    private List<Person> personList = new ArrayList<>();

    public SantaClaus(List<Person> personList) {
        if (personList == null || personList.size() == 0) {
            throw new IllegalArgumentException("A személyek listája nem lehet üres, vazze!");
        }

        this.personList = personList;
    }

    public void getThroughChimneys() {
        for (Person person : personList) {
            person.setPresent();
        }
    }

    public List<Person> getPersonList() {
        return personList;
    }
}