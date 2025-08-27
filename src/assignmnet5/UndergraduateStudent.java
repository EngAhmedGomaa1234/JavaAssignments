package assignmnet5;

public class UndergraduateStudent extends Student {
    // field specific to UndergraduateStudent
    public String major;
    public int year;
    // parameterized constructor for UndergraduateStudent class
public UndergraduateStudent (String name, int age, String studentid, char grade, String major, int year){
super(name, age, studentid, grade); // calling the parent class constructor (student)
    this.major=major;
    this.year = year;
}
// setters for the attributes of the class
   public void setUndergraduateMajor (String major)
   {
       this.major=major;
   }
    public void setUndergraduateYear (int year)
    {
         this.year=year;
    }
    // overridden Action methods
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Major: "+this.major+", Year: "+this.year);
    }
}
