package week13d03;
//Meginteg

import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class TeacherStatistics {

    private List<Teacher> teachers = new ArrayList<>();

    public void teachersReadFromFile(BufferedReader data) throws IOException {
        String line;
        String name;
        String subjecst;
        String classRoom;
        int tHours;
        while ((name = data.readLine()) != null) {
            subjecst = data.readLine();
            classRoom = data.readLine();
            line = data.readLine();
            tHours = Integer.parseInt(line);
            teachers.add(new Teacher(name, subjecst, classRoom, tHours));
        }
    }

    public int weekWork(String name) {

        return teachers.stream().filter(c -> c.getName().equals(name)).
                collect(Collectors.summingInt(Teacher::gettHours));
    }

    public static void main(String[] args) {
        TeacherStatistics tStat = new TeacherStatistics();
        Path file = Path.of("beosztas.txt");
        try {
            BufferedReader data = Files.newBufferedReader(file);
            tStat.teachersReadFromFile(data);
        } catch (IOException e) {
            throw new IllegalStateException("...és a fájl b*szod?");
        }
        System.out.println("Biszibaszi István: " + tStat.weekWork("Biszibaszi István"));
        System.out.println("Taknyos Aladár: " + tStat.weekWork("Talnyos Aladár"));
        System.out.println("Köcsög Gerson: " + tStat.weekWork("Köcsög Gerson"));
    }
}