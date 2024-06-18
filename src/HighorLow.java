import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess;
        do {
            System.out.print("Guess the number (between 1 and 10): ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    break;
                }
            }
            System.out.println("Invalid input. Please enter an integer between 1 and 10.");
            scanner.nextLine();
        } while (true);
        System.out.println("The random number was: " + randomNumber);
        if (userGuess > randomNumber) {
            System.out.println("too high!");
        } else if (userGuess < randomNumber) {
            System.out.println("too low!");
        } else {
            System.out.println("On the money!");
        }
    }
}
