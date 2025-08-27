package assignmnet6;

public class Circle extends Shape {
    // field
    public double radius;
    // constructor for Circle class, calling superclass constructor
    public Circle(double radius) {
        super( "Circle");
        this.radius = radius;
    }
        @Override
        public double getArea () {
            return Math.PI * radius * radius;
        }
        @Override
        public double getPerimeter () {
            return 2 * Math.PI * radius;
        }
        public double getRadius () {
            return radius;
        }
    }


