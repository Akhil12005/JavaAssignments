package Assignment7;

import java.util.Scanner;

public class Prblm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

            int number = scanner.nextInt();

            if (number >= 0) {
                long factorial = calculateFactorial(number);
                System.out.println("Factorial of " + number + " is: " + factorial);
                        }
        scanner.close();
    }
    private static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

