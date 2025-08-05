package assignmnet3;

public class GradeEvaluator {
    public static char grade;

    public static void evaluate(int score) {
        if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else grade = 'F';
    }
}
