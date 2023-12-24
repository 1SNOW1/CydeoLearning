package day20_forEach;

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
    }
}
