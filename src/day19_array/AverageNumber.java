package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int question1 = input.nextInt();

        int[] arr1 = new int[question1];
        int sum = 0;

        for (int i = 0; i < question1; i++) {
            System.out.println("Enter a number: ");
            arr1[i] = input.nextInt();
            sum += arr1[i];

        }


        DecimalFormat df = new DecimalFormat("0.00");
        double average = sum / (double)question1;

        
        System.out.println(Arrays.toString(arr1));
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));
    }
}
