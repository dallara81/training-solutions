package debug;
// Debug lecke - Alkalmazottak

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Kovács Tivadar", 1967);
        Employee employee2 = new Employee("Takács Aladár", 1952);
        Employee employee3 = new Employee("Bugyi László", 1983);
        Employee employee4 = new Employee("Kenderesi Tas", 1982);
        Employee employee5 = new Employee("Ungvári Töhötöm", 1981);
        Employee employee6 = new Employee("Répcelaki Huba", 1976);
        Employee employee7 = new Employee("Puskás Ubul", 1978);
        Employee employee8 = new Employee("Rézműves-Kolompár Dezső", 2001);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);
        company.addEmployee(employee6);
        company.addEmployee(employee7);
        company.addEmployee(employee8);

        System.out.println("--- Alkalmazottak ---");
        System.out.println(" ");
        System.out.println("Hol vagy Ubul?");
        Employee jack = company.findEmployeeByName("Puskás Ubul");
        System.out.println(jack.getName() + " " + jack.getYearOfBirth());

        System.out.println(" ");
        System.out.println("Alkalmazottak listája > ");
        List<String> names = company.listEmployeeNames();
        System.out.println(names);

    }

}