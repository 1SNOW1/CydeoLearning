package day22_arraysList;

import Utilities.ArraysUtility;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,80,90};

       boolean has25 = ArraysUtility.contains(numbers, 20);
        System.out.println("has25 = " + has25);


        System.out.println("-----------------------------------");


        String[] students = {"Sumeye", "Hamza", "Marika"};
        System.out.println(ArraysUtility.contains(students, "Hamza"));



    }
}
