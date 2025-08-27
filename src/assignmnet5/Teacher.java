package assignmnet5;

public class Teacher extends Person{
    // initializing the attributes of the class
    public String teacherId;
    public String subject;
    // parameterized constructor for the Teacher class, here we are initializing the attributes of the class and calling the parent class constructor
    public Teacher (String name, int age , String teacherId, String subject){
        super(name, age);
        this.teacherId = teacherId;
        this.subject=subject;
    }
    // setters for the attributes of the class
    public void setTeacherId (String teacherId)
    {
        this.teacherId=teacherId;
    }
    public void setTeachingSubject (String subject)
    {
        this.subject = subject;
    }
    //overridden Action methods
        @Override
        public void displayInfo()
        {
            super.displayInfo();
            System.out.println("Teacher ID: "+this.teacherId+", and teaches "+this.subject);
        }
        @Override
        public void celebrateBirthday()
        {
            super.celebrateBirthday();
            System.out.println("We are celebrating Teacher: "+this.name+ " who has ID: "+this.teacherId+", and teaches "+this.subject);
        }
        // Public method: Specific behavior for a teacher
        public void teach() {
            System.out.println(this.name + " with the ID: " + this.teacherId + " is now Teaching (" + this.subject + ").");
            System.out.println("");
        }
}
