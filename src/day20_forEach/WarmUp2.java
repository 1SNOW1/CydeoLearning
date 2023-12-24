package day20_forEach;

import Utilities.ArraysUtility;
import java.util.Arrays;

public class WarmUp2 {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0, j= 0; i < arr1.length && j < arr2.length; i++, j++, k++) {
           arr3[k] = arr1[i];
           k++;
           arr3[k] = arr2[j];
        }
        System.out.println(Arrays.toString(arr3));


        System.out.println("---------------------------------------");

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100};

        int[] a3 = ArraysUtility.merge(a1, a2 );

        System.out.println(Arrays.toString(a3));

        System.out.println("------------------------------------------");

        double[] b1 = {10.5,20.5,30.5,40.5};
        double[] b2 = {5.6,5.7,55.8};

       double[] b3 = ArraysUtility.merge(b1, b2);

        System.out.println("-------------------------------------------");

        char[] c1 = {'A', 'B', 'C'};
        char[] c2 = {'a', 'b', 'c'};
        char[] c3 = ArraysUtility.merge(c1, c2);
        System.out.println(Arrays.toString(c3));

        System.out.println("------------------------------------");

        String[] s1 = {"Java", "Baba", "Anam", "Gurbaaan"};
        String[] s2 = {"Python", "Gözumun", "Cicaaa", "Gurbaaann"};
        String[] s3 = ArraysUtility.merge(s1, s2);
        System.out.println(Arrays.toString(s3));


    }
}
