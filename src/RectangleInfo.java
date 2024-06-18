import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;
        do {
            System.out.print("Rectangle width: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) {
                    break;
                }
            }
            System.out.println("Error enter a positive");
            scanner.nextLine();
        } while (true);
        do {
            System.out.print("Rectangle height: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    break;
                }
            }
            System.out.println("Error enter a positive");
            scanner.nextLine();
        } while (true);
        double area = width * height;
        double perimeter = 2 * (width + height);


        double diagonal = Math.sqrt(width * width + height * height);
        System.out.printf("area: " + area);
        System.out.printf(" perimeter: " + perimeter);
        System.out.printf(" Hypotenuse: " + diagonal);
    }
}