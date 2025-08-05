package assignmnet3;

public class OutputDisplayer {
    public static void display(String code, String name, int age, int score, char grade) {
        System.out.println("\n--- User Information ---");
        System.out.println("Constant Code: " + code);
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Letter Grade: " + grade);
    }
}
