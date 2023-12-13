package day16_nestedLoop;

import java.util.Scanner;

public class loopPractices {

    public static void main(String[] args) {



        for (int i = 1; i < 6 ; i++) {
            System.out.println("Hello" + i); //the variable i is only defined within the curly brackets of the for loop

        }
        System.out.println("-------------------------------------");


        int j = 0;
        while (j < 6) {
            j++;

            System.out.print(j);
        }
        System.out.println("-----------------------------------------");

        int k = 0;
        do {
            System.out.println("Hello" + k);
            k++;
        }while (k<5);


        System.out.println("-------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = input.nextInt();
        while (score < 0 || score > 100){
            System.err.println("Invalid score, please re-enter your score: ");
            score = input.nextInt();
        }

        if (score >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

    }
}
