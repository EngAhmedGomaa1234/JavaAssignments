package assignmnet3;
import java.util.Scanner;

public class LoginSystem {
    private static final String validEmail = "ahmed_alx1234@yahoo.com";
    private static final String validPassword = "Ahmed1234";
    private static boolean isLoggedIn = false;
    private static boolean accountIsLocked = false;
    private static int attemptCount = 0;

    public static boolean login() {
        Scanner input = new Scanner(System.in);

        while (!accountIsLocked && !isLoggedIn && attemptCount < 3) {
            System.out.println("Please enter your email:");
            String email = input.nextLine().toLowerCase();

            System.out.println("Please enter your password:");
            String password = input.nextLine();

            if (email.equals(validEmail) && password.equals(validPassword)) {
                isLoggedIn = true;
                attemptCount = 0;
                System.out.println("Login successful! Welcome " + email);
            } else {
                attemptCount++;
                System.out.println("Invalid credentials, you have " + (3 - attemptCount) + " attempts left.");
            }
        }

        if (attemptCount == 3) {
            lockAccount();
            System.out.println("Your account is locked due to too many failed login attempts.");
        }

        return isLoggedIn && !accountIsLocked;
    }

    private static void lockAccount() {
        accountIsLocked = true;
        isLoggedIn = false;
    }
}
