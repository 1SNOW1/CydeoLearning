package day10_Scanner_String;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;


public class stringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "Java";

        System.out.println();

        input.close();

        System.out.println("-----------------------------------------");



        String str1 = "Cat";
        String str2 = "Dog";


        String str3 = "Cat";
        String str4 = "Cat";

        System.out.println(str1 == str3);
        System.out.println(str3 == str4);
        System.out.println(str1 == str2);


        String s1 = new String("Original");
        String s2 = new String("Original");

        System.out.println(s1 == s2);


        System.out.println("-----------------------------------------");


        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
        System.out.println(t2 == t3);






    }
}
