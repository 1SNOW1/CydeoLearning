package day36_polymorphism;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3);


        circle1.equals(circle2);

        System.out.println(circle1.equals(circle2));


        System.out.println("----------------------------------------------------------");

        Iphone iphone1 = new Iphone("Apple", "12 pro max", "Large", "Black", 1000);
        Iphone iphone2 = new Iphone("Apple", "12 pro max", "Large", "Black", 1000);

        iphone1.equals(iphone2);
        System.out.println(iphone1.equals(iphone2));








    }
}
