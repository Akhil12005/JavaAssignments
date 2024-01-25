    import java.util.Scanner;
    public class StrFlt {
        public static void main(String[] args) {
            // Reading a float represented as a string dynamically using Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a float (as a string): ");
            String userInputString = scanner.next();

            // Convert string to float
            try {
                float stringToFloat = Float.parseFloat(userInputString);
                System.out.println("Converted String to Float: " + stringToFloat);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for conversion to float.");
            }

            // Close the Scanner
            scanner.close();
        }
    }

