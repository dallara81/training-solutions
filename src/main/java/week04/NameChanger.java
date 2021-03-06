package week04;

public class NameChanger {

    private String fullName;

    public NameChanger(String fullName) {
        if (fullName == null || fullName.trim().length() == 0) {
            throw new IllegalArgumentException("Érvénytelen név: " + fullName);
        }
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void changeFirstName(String firstName) {
        fullName = firstName + fullName.substring(fullName.indexOf(" "));
    }

    public boolean isTheSame(String otherfullname){
        return fullName.equals(otherfullname);
    }
}