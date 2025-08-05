package assignmnet3;
public class Main {
    public static void main(String[] args) {
        if (LoginSystem.login()) {
            UserDataCollector.collect();
            GradeEvaluator.evaluate(UserDataCollector.score);
            OutputDisplayer.display(
                    UserDataCollector.constantCode,
                    UserDataCollector.fullName,
                    UserDataCollector.age,
                    UserDataCollector.score,
                    GradeEvaluator.grade
            );
        }
    }
}
