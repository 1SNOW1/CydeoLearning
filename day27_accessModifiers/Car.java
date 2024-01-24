package day27_accessModifiers;

import java.awt.event.MouseWheelEvent;

public class Car { //outer class

    public String make, model, color;
    public int year;
    public double price;


    public static int wheels = 4;


    public class carEngine { //inner class, instance class, you need the obj of outer class to access it

        public void method() {
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass{

        public void method(){
            System.out.println(wheels);
        }

    }

}
