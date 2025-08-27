package assignmnet5;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person1 = new Person("Ahmed", 30);
        person1.displayInfo();
        person1.celebrateBirthday();
        // Creating an instance of the Student class
        Student student1 = new Student("Mohamed", 20, "S12345", 'A');
        student1.displayInfo();
        student1.celebrateBirthday();
        student1.study();
        // Creating an instance of the Teacher class
        Teacher teacher1 = new Teacher("Mr. Shafiey", 40, "T67890", "Testing");
        teacher1.displayInfo();
        teacher1.celebrateBirthday();
        teacher1.teach();
        // Creating an instance of the UnderGradStudent class
        UndergraduateStudent ugStudent1 = new UndergraduateStudent("Omar", 18, "UG101", 'B', "History", 2023);
        ugStudent1.displayInfo();

    }
}
