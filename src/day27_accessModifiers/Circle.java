package day27_accessModifiers;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    /*
    public static double calcArea(){ //the reason why this method does not work is that static only accepts static
        return radius * radius * pi;
    }

     */

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){ //omkrets
        return diameter * diameter;
    }

    public static void printPiValue(){ //this method only uses statics, so I use a static method
        System.out.println("PI value is: " + pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius = " + radius +
                ", diameter = " + diameter +
                ", PI = " + pi +
                ", area = " + calcArea() +
                ", Perimeter = " + calcPerimeter() +
                '}';
    }
}
