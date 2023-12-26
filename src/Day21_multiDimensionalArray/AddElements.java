package Day21_multiDimensionalArray;

import java.util.Arrays;

import Utilities.ArraysUtility;

public class AddElements {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        int element = 6;

        //in the copyOf method you first assign the array that will be copied then you assign the length of it
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;


        System.out.println("-----------------------------------------------------");

        int[] numbers = {10, 20, 30, 40};


        numbers = ArraysUtility.addElement(numbers, 50);

        System.out.println(Arrays.toString(numbers));
    }
}
