package day15_whileLoop;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int maxNumber = Integer.MIN_VALUE; //initialize to the smallest possible integer value

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number #" + (i + 1) + ": ");
            int userInput = input.nextInt();

            if (userInput > maxNumber) {
                maxNumber = userInput;

            }
        }

        System.out.println("The maximum number is is: "+ maxNumber);

        input.close();
    }
}
