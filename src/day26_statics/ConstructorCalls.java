package day26_statics;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a ){
        //this(); //you use this() to call for the constructor, and constructor calls has to be the first step
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this(2.5);
        System.out.println("Constructor with the String argument");
    }



    public static void main(String[] args) {

        method1();

        System.out.println("-----------------------------------------------");

        method2();

        System.out.println("-----------------------------------------------");

        method3();



    }


    public static void method1() {
        System.out.println("Method 1");
    }

    public static void method2() {
        System.out.println("Method 2");
    }

    public static void method3() {
        method1();
        method2();
        System.out.println("Method 3");

    }

}
