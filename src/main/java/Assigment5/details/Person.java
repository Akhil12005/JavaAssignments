package details;

public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print person details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating two instances of the Person class using the constructor
        Person person1 = new Person("John Doe", 25);
        Person person2 = new Person("Jane Smith", 30);

        // Printing details of the created persons
        System.out.println("Person 1 Details:");
        person1.printDetails();

        System.out.println("Person 2 Details:");
        person2.printDetails();
    }
}

