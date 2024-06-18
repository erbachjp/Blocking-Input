import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userGallons;
        double fuelEfficiency;
        double perGallon;


        do {System.out.print("How many gallons in tank?: ");
            userGallons = scanner.nextDouble();

        } while (userGallons <= 0);

        do {System.out.print("What is the fuel efficiency?: ");
            fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0);


        do {System.out.print("Price per gallon?: ");
            perGallon = scanner.nextDouble();
        } while (perGallon <= 0);
        double distance = userGallons * fuelEfficiency;
        double totalCost = (100 / fuelEfficiency) * perGallon;
        System.out.printf("The cost per 100 miles is " + totalCost + " and it will travel " + distance + " miles");


    }
}
