package day36_polymorphism;

public class Circle { //we created this class to compare one circle with another circle


    //variables
    private double radius;

    public final static double PI = 3.14;

    //constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    //getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //additional methods
    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", area = " + area() +
                ", perimeter = " + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Circle)){ //if the specified object is not circle, then we should not compare them
            System.err.println("invalid object");
            System.exit(1);
        }

        if (radius == (((Circle) obj).radius)){ //if the current circles radius is equal to the given circles radius then the two circles are equal
            return true;
        }
        return false;
    }
}
