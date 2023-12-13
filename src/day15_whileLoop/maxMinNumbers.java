package day15_whileLoop;

import java.util.Scanner;

public class maxMinNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // any integer number that user enter will ALWAYS be greater than min integer number
        int min = Integer.MAX_VALUE; // any integer number that user enter will ALWAYS be lesser than the max integer number


        for (int i = 0; i < 5; i++) {
            System.out.println("Type a number: ");
            int num = input.nextInt();

            if(num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

    }

}
