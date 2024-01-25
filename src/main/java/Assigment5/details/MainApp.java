package details;

public class MainApp {
    public static void main(String[] args) {
        // Creating two instances of the Person class using the constructor
        Person person1 = new Person("Akhil", 26);
        Person person2 = new Person("Akhil2", 27);

        // Printing details of the created persons
        System.out.println("***Part1***");

        System.out.println("Person 1 Details:");
        person1.printDetails();

        System.out.println("Person 2 Details:");
        person2.printDetails();


        System.out.println("***Part2***");

        Employee employee1 = new Employee("Akhil Chinthakindhi", "Software Engineer", 65000.0);

        // Printing details of the employee
        employee1.printDetails();

        // Calculating and printing the bonus
        double bonus = employee1.calculateBonus();
        System.out.println("Bonus: " + bonus);

        // Updating salary by a 5% increase
        employee1.updateSalary(5);


    }
}
