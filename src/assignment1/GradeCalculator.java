package assignment1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name!");
        String name = input.nextLine();
        System.out.println("Please Enter Your Grade in Math in number!");
        int subject1 = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Please Enter Your Grade in English in number!");
        int subject2 = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Please Enter Your Grade in Arabic in number!");
        int subject3 = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()
int TotalMarks= subject1 + subject2 + subject3;
float AvgMarks =  (float) TotalMarks / 3;
System.out.println("Name= " + name);
System.out.println("Total Mark= " + TotalMarks);
System.out.println("Average Mark= " + AvgMarks);
char grade;
        if (AvgMarks >= 90) {
            grade = 'A';
        } else if (AvgMarks >= 80) {
            grade = 'B';
        } else if (AvgMarks >= 70) {
            grade = 'C';
        } else if (AvgMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("grade " + grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent work!");
                break;
            case 'B':
                System.out.println("Great job!");
                break;
            case 'C':
                System.out.println("Good effort!");
                break;
            case 'D':
                System.out.println("You passed, but aim higher.");
                break;
            case 'F':
                System.out.println("You need to improve.");
                break;
            default:
                System.out.println("Error️");
        }
    }
}
