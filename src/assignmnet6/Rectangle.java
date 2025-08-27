package assignmnet6;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {

        super("Rectangle");
        this.length = length;
        this.width = width;
    }
        @Override
                public double getArea(){return length*width;}
        @Override
                public double getPerimeter(){return 2*(length+width);}
                public double getLength(){return length;}
                public double getWidth(){return width;}

    }

