import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        boolean validInput = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Fahrenheit temp is: " + fahrenheit);
            } else {
                System.out.println("enter a number please");
                scanner.next();
            }
        } while (!validInput);
    }
}
