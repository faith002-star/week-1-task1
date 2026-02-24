import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        String correctPassword = "1234";
        do {
            System.out.print("Enter password: ");
            password = input.nextLine();
            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect. Try again.");
            }
        } while (!password.equals(correctPassword)); 
        System.out.println("Access Granted");       
        input.close();
    }
}