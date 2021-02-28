package week13d04;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemplateMerger {

    public String merge(Path file, List<Employee> employees) {
        try {
            listValidator(employees);
            String template = Files.readString(file);
            return getString(employees, template);
        } catch (IOException ioe) {
            throw new IllegalStateException("I will, but can not read your poor file!", ioe);
        }
    }

    private String getString(List<Employee> employees, String template) {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(template.replace("{nev}", employee.getName())
                    .replace("{ev}", Integer.toString(employee.getYearOfBirth()))).append("\n");
        }
        return sb.toString();
    }

    private void listValidator(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            throw new IllegalArgumentException("Empty list... yes, empty as your asshead!");
        }
    }
}