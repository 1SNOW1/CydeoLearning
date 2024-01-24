package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6};
        //int[] array2 = {7,8,9,10,11,12};
        int[] reverse = new int[array1.length];

        for (int i = reverse.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array1[i];

        }

        System.out.println(Arrays.toString(reverse));


        System.out.println("-------------------------------------");

        int[] nums = {100,200,300,400,500};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("---------------------------------------");

        double[] a1 = {1.6,1.7,1.8,6.5,8.8};
        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));




    }

}
