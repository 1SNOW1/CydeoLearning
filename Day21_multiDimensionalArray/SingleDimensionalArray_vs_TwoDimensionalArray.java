package Day21_multiDimensionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {

    public static void main(String[] args) {

        int[] arr1D = new int[10];
        System.out.println(Arrays.toString(arr1D));

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {6,7,8};
        int[] arr3 = {9,10,11};
        int[] arr4 = {12,13,14};
        int[] arr5 = {15,16,17};

        int[][] arr2D = new int[5][];


        arr2D[0] = arr5;
        arr2D[1] = arr1;
        arr2D[2] = arr2;
        arr2D[3] = arr3;
        arr2D[4] = arr4;

        System.out.println(Arrays.deepToString(arr2D));
    }
}
