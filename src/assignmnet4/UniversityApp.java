package assignmnet4;

public class UniversityApp {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Ahmed Gomaa", 1001, "Computer Science");
        Student student2 = new Student("Inas Mohamed", 1002, "Business Administration");

        // Display info for both students
        student1.displayStudentInfo();
        student2.displayStudentInfo();

        // Update GPA for student1
        student1.updateGpa(3.5);

        // Display updated info for student1
        student1.displayStudentInfo();
    }
}