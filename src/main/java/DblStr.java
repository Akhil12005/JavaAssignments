import java.util.Scanner;

public class DblStr {
    public static void main(String[] args) {
        // Reading a double dynamically using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double userInputDouble = scanner.nextDouble();

        // Convert double to string
        String doubleToString = Double.toString(userInputDouble);
        System.out.println("Converted Double to String: " + doubleToString);

        // Close the Scanner
        scanner.close();
    }
}
