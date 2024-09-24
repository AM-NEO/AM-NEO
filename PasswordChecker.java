import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String correctPassword = "nicholas";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Correct password!");
                break; // Exit the loop if the password is correct
            } else {
                attempts--;
                System.out.println("Incorrect password. You have " + attempts + " attempts remaining.");
            }
        }

        if (attempts == 0) {
            System.out.println("Too many incorrect attempts. Access denied.");
        }
        scanner.close();
    }
}