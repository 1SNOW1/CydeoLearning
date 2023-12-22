package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user = "";
        {

            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number you have entered is even: " + number);
            } else {
                System.out.println("The number you have entered is odd: " + number);
            }

            System.out.println("Do you wanna exit the program or continue?");


        }

    }

}
