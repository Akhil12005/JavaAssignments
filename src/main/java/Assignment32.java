import java.util.Scanner;

public class Assignment32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double number = scanner.nextDouble();

        scanner.close();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth Power: " + fourthPower);
    }
}
