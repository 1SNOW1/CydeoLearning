package day9_scanner;


import java.util.Scanner;


public class whatDayScanner {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);

            int n = input.nextInt();


        String day = (n == 1) ? "monday" :(n==2)? "tuesday" :(n==3)? "wednesday" :(n==4)? "thursday" :(n==5)? "friday" :(n==6)? "saturday" :(n==7)? "sunday" : "no such day";

        System.out.println(day);

    }
}