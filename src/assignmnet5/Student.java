package assignmnet5;
// Student class inheriting the Person class
public class Student extends Person{
    // initializing the attributes of the class
public String studentId;
public char grade;
// parameterized constructor for the Student class, here we are initializing the attributes of the class and calling the parent class constructor
public Student (String name, int age , String studentId, char grade){
    super(name, age);
    this.studentId = studentId;
    this.grade=grade;
}

// setters for the attributes of the class
public void setStudentId (String studentId)
{
    this.studentId=studentId;
}

public void setStudentGrade (char studentGrade)
    {
        this.grade=studentGrade;
    }

//overridden Action methods
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Student ID: "+this.studentId+", Grade "+this.grade);
    }
    @Override
    public void celebrateBirthday()
    {
        super.celebrateBirthday();
        System.out.println(this.name+", with ID: "+this.studentId+", have a grade "+this.grade);
    }
    // Public method: Specific behavior for a student
    public void study() {
        System.out.println(this.name + " (ID: " + this.studentId + ") is studying.");
        System.out.println("");
    }
}

