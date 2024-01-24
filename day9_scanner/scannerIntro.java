package day9_scanner;


import java.util.Scanner; //this imports a single thing from the package, its called a regular import
//import java.util.*; --> this imports everything within the package, and it's called a wild import

public class scannerIntro {

    public static void main(String[] args) {
//Scanner keyboard = Scanner(System.in);  |||  this gives the scanner access to whatever comes from my keyboard. Basically it will be connected with my keyboard


        Scanner input = new Scanner (System.in); //for reading user inputs

        System.out.println("Enter a number: ");
        byte num1 = input.nextByte();
        System.out.println("Enter another number: ");
        byte num2 = input.nextByte();
        System.out.println("Enter yet another number: ");
        byte num3 = input.nextByte();
        System.out.println("Enter yet another number: ");
        long long1 = input.nextLong();

        input.close();

        System.out.println("you entered : "+num1);

        System.out.println("you entered : "+num2);

        System.out.println("you entered : "+num3);

        System.out.println("you entered : "+long1);


    }
}
