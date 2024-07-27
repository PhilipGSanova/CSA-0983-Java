// Employee class
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.0;
    }
}

// HRManager class (subclass of Employee)
class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing HR tasks.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}
public class A4_1{
    public static void main(String[] args) {
        HRManager m = new HRManager();
        m.work();
        m.addEmployee();
    }
}