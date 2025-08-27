package assignmnet6;
// abstract class Shape implementing Measurable interface
public abstract class Shape implements Measurable{
    protected String name; // name of the shape
    // constructor for Shape class
    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
