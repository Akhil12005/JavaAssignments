package Assignment8;
// Parent class Employee
class Employee {
    // Method to perform work
    void work() {
        System.out.println("Employee is working");
    }

    // Method to get salary
    int getSalary() {
        return 50000; // Default salary for demonstration
    }
}

// Subclass HRManager inheriting from Employee
class HRManager extends Employee {
    // Override the work method
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    // Method specific to HRManager
    void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}

// Main class
public class Program2 {
    public static void main(String[] args) {
        // Creating objects
        Employee employee = new Employee();
        HRManager hrManager = new HRManager();

        // Calling methods
        employee.work();           // Output: Employee is working
        System.out.println("Employee Salary: $" + employee.getSalary()); // Output: Employee Salary: $50000

        hrManager.work();          // Output: HR Manager is managing employees
        System.out.println("HR Manager Salary: $" + hrManager.getSalary()); // Output: HR Manager Salary: $50000
        hrManager.addEmployee();   // Output: HR Manager is adding a new employee
    }
}