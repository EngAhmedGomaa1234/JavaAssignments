import java.util.Scanner;

public class Login {

        public static void main(String[] args) {
            final String VALID_EMAIL = "Ahmed_Alx1234@yahoo.com";
            final String VALID_PASSWORD = "0116227155";
            final int MAX_ATTEMPTS = 3;
            Scanner scanner = new Scanner(System.in);

            // Login System
            boolean loggedIn = false;
            for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (email.equals(VALID_EMAIL) && password.equals(VALID_PASSWORD)) {
                    loggedIn = true;
                    break;
                } else {
                    System.out.println("Invalid credentials. Attempt " + attempt + " of " + MAX_ATTEMPTS + ".");
                }
            }

            if (!loggedIn) {
                System.out.println("Account locked due to too many failed attempts.");
                return;
            }

            // User Information Collection
            System.out.print("Enter your constant code: ");
            final String constantCode = scanner.nextLine();

            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            int grade;
            while (true) {
                System.out.print("Enter your grade (0-100): ");
                grade = Integer.parseInt(scanner.nextLine());
                if (grade >= 0 && grade <= 100) {
                    break;
                } else {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }
            }

            // Grade Evaluation
            char letterGrade;
            if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            // Output
            System.out.println("\n--- User Information ---");
            System.out.println("Constant Code: " + constantCode);
            System.out.println("Full Name: " + fullName);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
            System.out.println("Letter Grade: " + letterGrade);
        }

}
