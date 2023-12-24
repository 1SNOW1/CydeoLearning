package Utilities;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0, j= 0; i < arr1.length && j < arr2.length; i++, j++, k++) {
            arr3[k] = arr1[i];
            k++;
            arr3[k] = arr2[j];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0, j= 0; i < arr1.length && j < arr2.length; i++, j++, k++) {
            arr3[k] = arr1[i];
            k++;
            arr3[k] = arr2[j];
        }
        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2){

        char[] arr3 = new char[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0, j= 0; i < arr1.length && j < arr2.length; i++, j++, k++) {
            arr3[k] = arr1[i];
            k++;
            arr3[k] = arr2[j];
        }
        return arr3;
    }

}
