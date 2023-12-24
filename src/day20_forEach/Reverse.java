package day20_forEach;

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
    }
}
