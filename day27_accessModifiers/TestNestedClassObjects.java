package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object

        obj1.new carEngine(); //carEngine object


        new Car.StaticInnerClass();


    }

}
