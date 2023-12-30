package day15_whileLoop;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if(number <= minValue) {
                minValue = number;
            }

            input.close();
        }

        System.out.println("The minimum numbers is: " + minValue);
    }
}

