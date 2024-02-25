package Assignment10;

import java.util.*;

// Define a class named Program1
public class Program1 {

    // Method to calculate the sum of digits in the given string
    public int sumOfDigits(String str) {
        int l = str.length(); // Get the length of the given string
        int sum = 0; // Initialize the sum of digits

        // Loop through each character of the string
        for (int i = 0; i < l; i++) {
            // Check if the character at the current index is a digit
            if (Character.isDigit(str.charAt(i))) {
                String tmp = str.substring(i, i + 1); // Get the digit as a substring
                sum += Integer.parseInt(tmp); // Convert the digit to integer and add it to the sum
            }
        }
        return sum; // Return the total sum of digits in the string
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Program1 m = new Program1(); // Create an instance

        String str1 = "123"; // Given string
        // Display the given string and the sum of its digits
        System.out.println("The given string is: " + str1);
        System.out.println("The sum of the digits in the string is: " + m.sumOfDigits(str1));
    }
}
