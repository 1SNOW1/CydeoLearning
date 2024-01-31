package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

       /* String str = "Java";

        char ch = str.charAt(250);

        System.out.println(ch);

        */

        Pizza pizza  = null;
       // pizza.calcCost();


        //System.out.println(50/0);  unchecked exception

        System.out.println("Hello world");


        System.out.println("------------------------------------------------");


        int score = 100;

        if (score > 59){
            System.out.println("your grade is D");
        }else if (score > 70){
            System.out.println("your grade is C");
        }

        //there is a bug in the code above, but it's a logical error and won't throw an exception

        System.out.println("------------------------------------------------");

        //FileInputStream file = new FileInputStream(""); //checked exception

        //Thread.sleep(3000); //checked exception


    }
}
