abstract class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public abstract double calculateBonus(); // returns bonus amount
    public abstract String generatePerformanceReport(); // returns performance report as a string
    public abstract void manageProject(String projectName); // manages a project

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Salary: " + salary + ", Job Title: " + jobTitle;
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2; // example bonus calculation
    }

    @Override
    public String generatePerformanceReport() {
        return name + " has managed projects efficiently and achieved targets on time.";
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " is managing the project: " + projectName);
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // example bonus calculation
    }

    @Override
    public String generatePerformanceReport() {
        return name + " has developed high-quality code and completed tasks on schedule.";
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " is developing features for the project: " + projectName);
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1; // example bonus calculation
    }

    @Override
    public String generatePerformanceReport() {
        return name + " has written efficient code and debugged issues promptly.";
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println(name + " is programming modules for the project: " + projectName);
    }
}
public class A4_3 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", "123 Main St", 100000);
        Employee developer = new Developer("Bob", "456 Elm St", 80000);
        Employee programmer = new Programmer("Charlie", "789 Oak St", 60000);

        System.out.println(manager);
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println("Performance Report: " + manager.generatePerformanceReport());
        manager.manageProject("Project Alpha");
        System.out.println();

        System.out.println(developer);
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println("Performance Report: " + developer.generatePerformanceReport());
        developer.manageProject("Project Beta");
        System.out.println();

        System.out.println(programmer);
        System.out.println("Bonus: " + programmer.calculateBonus());
        System.out.println("Performance Report: " + programmer.generatePerformanceReport());
        programmer.manageProject("Project Gamma");
    }
}
