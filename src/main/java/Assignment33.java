import java.util.Scanner;

public class Assignment33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four integers, one at a time:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        scanner.close();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("NUmbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}
