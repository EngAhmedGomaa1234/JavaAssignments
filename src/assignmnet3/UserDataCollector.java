package assignmnet3;

import java.util.Scanner;

public class UserDataCollector {
    public static String constantCode;
    public static String fullName;
    public static int age;
    public static int score;

    public static void collect() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your constant code: ");
        constantCode = input.nextLine();

        System.out.print("Enter your full name: ");
        fullName = input.nextLine();

        System.out.print("Enter your age: ");
        age = Integer.parseInt(input.nextLine());

        while (true) {
            System.out.print("Enter your score (0-100): ");
            score = Integer.parseInt(input.nextLine());
            if (score >= 0 && score <= 100) break;
            else System.out.println("Invalid score. Please enter a value between 0 and 100.");
        }
    }
}
