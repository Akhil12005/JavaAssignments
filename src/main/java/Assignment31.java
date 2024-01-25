import java.util.Scanner;

public class Assignment31 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number in inches: ");

        double inches = scanner.nextDouble();

        scanner.close();

        double meters = inches * 0.0254;

        System.out.println(inches + " inches is equal to " + meters + " meters.");
    }
}