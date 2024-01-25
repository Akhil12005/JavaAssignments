package details;

public class Employee {
    // Attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate bonus (10% of salary)
    public double calculateBonus() {
        return 0.1 * salary;
    }

    // Method to update salary
    public void updateSalary(double percentageIncrease) {
        double increaseAmount = salary * (percentageIncrease / 100);
        salary += increaseAmount;
        System.out.println("Salary updated. New Salary: " + salary);
        System.out.println("Revised Salary: " + salary);
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

