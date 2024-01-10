package day27_accessModifiers;

public class TestCircleObjects {

    public static void main(String[] args) {


        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(2.5);
        Circle circle4 = new Circle(1.25);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);

        System.out.println(Circle.pi);
        System.out.println(circle1.radius);



    }
}
