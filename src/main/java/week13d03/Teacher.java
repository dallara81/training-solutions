package week13d03;
// Fis-fos-hülye feladat,
// Értelme nem sok.
// Mindegy, csinálj valamit,
// Az értelem itt nem szempont.

public class Teacher {
    private String name;
    private String subjecst;
    private String classRoom;
    private int tHours;

    public Teacher(String name, String subjecst, String classRoom, int tHours) {
        this.name = name;
        this.subjecst = subjecst;
        this.classRoom = classRoom;
        this.tHours = tHours;
    }

    public String getName() {
        return name;
    }

    public String getSubjecst() {
        return subjecst;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public int gettHours() {
        return tHours;
    }
}