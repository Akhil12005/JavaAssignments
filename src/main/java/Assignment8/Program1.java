package Assignment8;

// Parent class Vehicle
class Vehicle {
    // Method drive
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    // Overriding the drive method
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        // Calling the drive method for both objects
        vehicle.drive(); // Output: Driving a vehicle
        car.drive();     // Output: Repairing a car
    }
}
