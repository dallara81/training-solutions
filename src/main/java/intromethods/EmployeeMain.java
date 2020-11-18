package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {
        System.out.println("*** Coding slaves on starvation v0.1 ***");
        Employee employee = new Employee("Anatoly Codefucker", 2018, 15000);
        System.out.println(" ");
        System.out.println("Salary > ");
        System.out.println(employee);

        employee.raiseSalary(3000);

        System.out.println(employee);

        System.out.println(" ");
        employee.setName("Anatoly Codefucker");
        System.out.println("Name > " + employee.getName());
        System.out.println("Hiring year > " + employee.getHiringYear());
        System.out.println("Salary > " + employee.getSalary());
    }
}