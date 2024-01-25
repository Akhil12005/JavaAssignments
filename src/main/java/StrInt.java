import java.util.Scanner;

public class StrInt {
    public static void main(String[] args) {
        // Reading an integer dynamically using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInputInt = scanner.nextInt();

        // Convert integer to string
        String intToString = Integer.toString(userInputInt);
        System.out.println("Converted Integer to String: " + intToString);

        // Reading a string dynamically using Scanner
        System.out.print("Enter a string: ");
        String userInputString = scanner.next();

        // Convert string to integer
        try {
            int stringToInt = Integer.parseInt(userInputString);
            System.out.println("Converted String to Integer: " + stringToInt);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for conversion to integer.");
        }

        // Close the Scanner
        scanner.close();
    }
}

