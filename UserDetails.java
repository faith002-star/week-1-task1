import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;
        double surfaceArea = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;

        System.out.printf("Volume = %.2f%n", volume);
        System.out.printf("Surface Area = %.2f%n", surfaceArea);

        scanner.close();
    }
}