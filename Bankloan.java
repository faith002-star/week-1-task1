import java.util.Scanner;

public class Bankloan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for age and annual income
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your annual income (KES): ");
        double income = scanner.nextDouble();

        // Check loan eligibility: age >= 21 AND income >= 21000
        if (age >= 21 && income >= 21000) {
            System.out.println("\nCongratulations! You qualify for a loan.");
        } else {
            System.out.println("\nUnfortunately, we are unable to offer you a loan at this time.");
        }

        scanner.close();
    }
}