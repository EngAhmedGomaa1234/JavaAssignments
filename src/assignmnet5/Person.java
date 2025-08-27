package assignmnet5;

public class Person {
    // setting the attributes of the class and making them public so that they can be accessed outside the class
    public String name;
    public int age;

    // parameterized Constructor for the Person class, here we are initializing the attributes of the class
    public Person (String name , int age){
        this.name = name;
        this.age = age;
    }
    // setters for the attributes of the class
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    // getters for the attributes of the class
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    // methods for the class
    public void displayInfo(){
        System.out.println("Hello, I'm "+ this.name +", my age is "+ this.age);
    }
    public void celebrateBirthday(){
        this.age++;
        System.out.println(this.name + " is now, "+ this.age +" years old!, Happy birthdaaay! <3.");
    }

}
