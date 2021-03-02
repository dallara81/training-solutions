package stringconcat.employee;

public class Employee {

    private String name;

    private String job;

    private int salary;

    public Employee(String name, String job, int salary) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("A névmező nem lehet üres!");
        }
        this.name = name;

        if (job == null || "".equals(job)) {
            throw new IllegalArgumentException("A 'munka' mező nem lehet üres!");
        }
        this.job = job;

        if (salary % 1000 > 0) {
            throw new IllegalArgumentException("A fizetésnek oszthatónak kell lennie ezerrel!");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Bár sokan ezt érdemelnék - de a fizetés értéke nem lehet negatív!");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - " + salary + " Forint";
    }
}