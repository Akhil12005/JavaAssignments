
import java.util.Scanner;

public class RomantoInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer equivalent: " + result);

        scanner.close();
    }
    private static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentNumeralValue = getRomanNumeralValue(s.charAt(i));

            if (i < s.length() - 1) {
                int nextNumeralValue = getRomanNumeralValue(s.charAt(i + 1));
                if (currentNumeralValue < nextNumeralValue) {
                    result += (nextNumeralValue - currentNumeralValue);
                    i++;
                    continue;
                }
            }
            result += currentNumeralValue;
        }

        return result;
    }
    private static int getRomanNumeralValue(char numeral) {
        switch (numeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}

