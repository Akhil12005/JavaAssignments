package Assignment7;

import java.util.Scanner;

public class Prblm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");

        if (scanner.hasNextInt()) {
            int monthNumber = scanner.nextInt();

            if (monthNumber >= 1 && monthNumber <= 12) {
                String monthName = getMonthName(monthNumber);
                System.out.println("The month is: " + monthName);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }

    private static String getMonthName(int monthNumber) {
        String monthName = null;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid Month";
                break;
        }

        return monthName;
    }
}
