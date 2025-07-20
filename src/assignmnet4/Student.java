package assignmnet4;
public class Student {
    // Attributes
    String name;
    int studentId;
    String major;
    double gpa;

    // Parameterized Constructor
    public Student(String name, int studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.gpa = 0.0; // default GPA
    }

    // Method to display student info
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("-----------------------");
    }

    // Method to update GPA
    public void updateGpa(double newGpa) {
        System.out.println("Current GPA: " + gpa);
        this.gpa = newGpa;
        System.out.println("Updated GPA: " + gpa);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a student object
        Student s1 = new Student("Ahmed Gomaa", 12345, "Computer Science");

        // Display initial info
        s1.displayStudentInfo();

        // Update GPA
        s1.updateGpa(3.7);

        // Display updated info
        s1.displayStudentInfo();
    }
}