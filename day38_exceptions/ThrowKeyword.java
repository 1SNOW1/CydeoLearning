package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0  || age > 150){
            if (age < 0){

                throw new InputMismatchException("Age cannot be less than 0: " + age + "\n please try again: ");
            }else{
                throw new InputMismatchException("Age cannot be more than 150:  " + age + "\n please try again: ");
            }

        }


        if (age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

    }
}
