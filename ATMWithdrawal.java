import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your initial account balance: ");
        double balance = input.nextDouble();
        while (balance > 0) {
            System.out.print("Enter amount to withdraw: ");
            double withdrawal = input.nextDouble();
            balance -= withdrawal;
            System.out.printf("Withdrawal successful. Current balance: %.2f KES%n", balance);
            if (balance <= 0) {
                System.out.println("Your account is now empty or overdrawn. Access denied.");
            }
        }
        input.close();
    }
}