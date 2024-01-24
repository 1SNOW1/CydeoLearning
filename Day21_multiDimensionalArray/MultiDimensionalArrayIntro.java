package Day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30,};
        int[] arr2 = {30, 40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};

        //now I need a container for these arrays.

        System.out.println("--------------------------------------------");

        int [][] array2D = {arr1, arr2, arr3};
        //now to print the contents of the 2D array -->
        for (int[] row : array2D) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("----------------------------------------------");

        String[] class1A = {"Halide", "Ahlam", "Jonis", "Huseyin", "Acer" };
        String[] class1B = {"Taha", "Enes", "Anes", "Adna", "Ayse" };
        String[] class1C = {"Harun", "Koussay", "Olla", "Allushi", "Halloumi" };

        String[][] class1Total = {class1A, class1B, class1C};
        for (String[] eachStudents : class1Total) {
            System.out.println(Arrays.toString(eachStudents));
        }

        System.out.println(class1Total.length);
        System.out.println(Arrays.toString(class1Total[1]));
        System.out.println(Arrays.toString(class1Total[2]));
        System.out.println(Arrays.toString(class1Total[0]));

        //lets say i want to print the first name one class1A
        System.out.println(class1Total[0][0]);
        System.out.println(class1Total[0][1]);
        System.out.println(class1Total[1][3]);
    }
}
