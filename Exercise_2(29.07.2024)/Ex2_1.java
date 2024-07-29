abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public abstract double calculateBonus();

    public void generatePerformanceReport() {
        System.out.println("Performance Report for " + jobTitle + ": " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("----------------------------");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; 
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.07; 
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.05;
    }
}
public class Ex2_1 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", "123 Nehru St.", 90000);
        Employee developer = new Developer("Bob", "456 ECR Ave.", 80000);
        Employee programmer = new Programmer("Charlie", "789 Golden Jubilee Blvd.", 70000);

        manager.generatePerformanceReport();
        developer.generatePerformanceReport();
        programmer.generatePerformanceReport();
    }
}
