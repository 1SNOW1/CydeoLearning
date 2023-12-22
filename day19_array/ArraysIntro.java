package day19_array;

import java.util.Arrays;
public class ArraysIntro {

    public static void main(String[] args) {
         
        // if you dont use data structure assigning score of 5 classes would look like this
        
        int score1 = 85;
        int score2 = 74;
        int score3 = 90;
        int score4 = 30;
        int score5 = 56;


        System.out.println("-----------------------------------------------------");

        // this is how it would be with data structures (number needs to be fixed to be an array)

        int[] scores = new int[5];

        scores[0] = 85;
        scores[1] = 74;
        scores[2] = 90;
        scores[3] = 30;
        scores[4] = 56;

        System.out.println( Arrays.toString(scores));


       /* scores = new int[10];
        System.out.println( Arrays.toString(scores));
// first and second declaration of "scores" will be available for garbageCollection at line 36, because at line 36 we declare a new data to that ref. var.
        scores = new int[50];
        System.out.println( Arrays.toString(scores));

        */

        System.out.println(scores[2]);
        System.out.println("---------------------------------------------------");

        //what if i want to display every value inside scores? We create a for-loop (because we know the amount of loops it takes to run through the data)

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("---------------------------------------------------");
        //what if I want to display the last index number?
        System.out.println(scores[scores.length-1]);





    }
}
