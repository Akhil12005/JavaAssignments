package Assignment9;

import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    // Abstract methods to calculate area and perimeter
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Subclass Circle inheriting from Shape
class Circle extends Shape {
    // Radius of the circle
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea method to calculate area of circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override calculatePerimeter method to calculate perimeter of circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Triangle inheriting from Shape
class Triangle extends Shape {
    // Sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override calculateArea method to calculate area of triangle
    @Override
    double calculateArea() {
        // Heron's formula to calculate area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override calculatePerimeter method to calculate perimeter of triangle
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Circle
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // Get input for Triangle
        System.out.print("Enter lengths of the three sides of the triangle (separated by space): ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);

        // Calculate and print area and perimeter for Circle
        System.out.println("\nCircle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Calculate and print area and perimeter for Triangle
        System.out.println("\nTriangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

        scanner.close();
    }
}


