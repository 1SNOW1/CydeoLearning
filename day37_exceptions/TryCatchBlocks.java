package day37_exceptions;

import java.io.IOException;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Program started");

        try{
            System.out.println(9/0);
            System.out.println("try block");
        }catch (RuntimeException a){
            System.out.println("catch block");
        }

        System.out.println("program ended");


        System.out.println("-----------------------------------------------------");


        System.out.println("program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
        } catch (RuntimeException runtimeException){

        }
        System.out.println("Program2 ended");


        System.out.println("-----------------------------------------------------");


        System.out.println("program 3 started");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("fixed?");
        }


        System.out.println("program 3 ended");
    }
}
