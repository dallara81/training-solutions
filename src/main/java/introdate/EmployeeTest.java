package introdate;

public class EmployeeTest {

    public static void main(String[] args) {

        // Employee
        Employee employee = new Employee(1981, 1, 1, "Hapteleki Aladár");

        // Header
        System.out.println("EmployeeTest v0.1 alpha");

        // BeginEmployment
        System.out.println(employee.getBeginEmployment());

        // DateOfBirth
        System.out.println(employee.getDateOfBirth());

    }

}
