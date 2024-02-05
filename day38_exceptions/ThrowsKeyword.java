package day38_exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        /*
        System.out.println("Program 1 started");

        try{
            System.out.println(100/0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }



        Thread.sleep(5000);


        System.out.println("Program 1 ended");

        System.out.println("---------------------------------------------------------");

        System.out.println("Program 2 started");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        System.out.println("Program 2 ended");
        */

        System.out.println("Program 1 started");

        Thread.sleep(5000);

        System.out.println("Program 1 ended");

        Thread.sleep(2000);


        System.out.println("-----------------------------------------------------");


        System.out.println("Program 2 started");

        Thread.sleep(5000);

        System.out.println("Program 2 ended");

        System.out.println("-----------------------------------------------------");

        System.out.println("program 3 started");

        //FileInputStream file = new FileInputStream(""); will give an exception because I haven't provided a path for the FileInputStream
        Thread.sleep(5000);

        System.out.println("program 3 ended");
    }
}
