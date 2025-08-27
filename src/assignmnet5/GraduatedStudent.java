package assignmnet5;

public class GraduatedStudent extends Student {
    // field
    public int graduationYear;

    // Constructor for GraduateStudent, calling superclass constructor
    public GraduatedStudent(String name, int age, String studentId, char grade, int graduationYear) {
        super(name, age, studentId, grade);
        this.graduationYear = graduationYear;
    }
    // Setters + the inherited ones
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
    // override direct parent's method (study() )
    @Override
    public void study() {
        super.study();
        System.out.println(this.name +" graduated in " + this.graduationYear + ".");
    }

    // specific method for GraduateStudent
    public void declareGraduationYear() {
        System.out.println(this.name + " has graduated in " + this.graduationYear + " .");
    }
}
