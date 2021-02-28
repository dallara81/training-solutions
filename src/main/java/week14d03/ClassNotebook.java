package week14d03;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ClassNotebook {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortNotebook() {
        List<Student> result = new ArrayList<>(students);
        result.sort(Comparator.comparing(Student::getName));
        return result;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

}