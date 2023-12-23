package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int [] arr1 = new int[100];

        // System.out.println("arr1 = " + Arrays.toString(arr1));

        /*
        for (int i = 0, j = 10; i < arr1.length; i++, j+=10) {
            arr1[i] = j;

        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
         */
// another way of writing the for-loop for this code is the way im doing it below
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println(" arr1 = " + Arrays.toString(arr1) );


        System.out.println("---------------------------------------------------------");

        int[] arr2 = new int[100]; //index is 0-99 right now


        for (int i = 0, j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

    }
}
