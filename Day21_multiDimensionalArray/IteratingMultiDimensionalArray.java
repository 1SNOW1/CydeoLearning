package Day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        String[][] class1Total = {
                {"Halide", "Ahlam", "Jonis", "Huseyin", "Acer"},
                {"Taha", "Enes", "Anes", "Adna", "Ayse"},
                {"Harun", "Koussay", "Olla", "Allushi", "Halloumi"}};


        for (int i = 0; i < class1Total.length; i++) { // i = index number of 1D array in classTotal

            String[] each1D = class1Total[i];
            System.out.println(Arrays.toString(class1Total[i]));

            for (int j = 0; j < each1D.length; j++) { // j = index number of elements in each 1D array of classTotal

                String eachElement = each1D[j];
                System.out.println(eachElement);
            }

        }


        System.out.println("-------------------------------------------------------------");

        for ( String[] each1DArray : class1Total){
            System.out.println(Arrays.toString(each1DArray));
            for ( String eachElements : each1DArray ){
                System.out.println(eachElements);
            }
        }


        System.out.println("---------------------------------------------------------------");

        for (int i = class1Total.length - 1; i >= 0; i--) {
            for (int j = class1Total[i].length - 1; j >= 0; j--) {
                System.out.println(class1Total[i][j]);
            }

        }

        System.out.println("-----------------------------------------------------------------");

        for (String[] strings : class1Total) {
            for (String eachString : strings) {
                System.out.println(eachString);
            }
        }


    }
}
/*
This Java code defines a two-dimensional array of strings named class1Total.
Each dimension represents a different set of students in a class.
The outer array (class1Total) contains three inner arrays,
each representing a different row or group of students in the class. Each inner array contains strings,
representing the names of individual students.
This initializes a 2D array class1Total with three rows and five columns,
where each element is a string representing a student's name.
The next part of the code is a nested loop that iterates through each element of the 2D array and prints the names.
The outer loop (i loop) iterates through each row (1D array) of the class1Total array.
Inside the outer loop, it retrieves the current row (1D array) using String[] each1D = class1Total[i]; and prints the entire row using
System.out.println(Arrays.toString(class1Total[i]));.
The inner loop (j loop) then iterates through each element in the current row,
printing each student's name individually.
So, the output of this code will be the names of all students in the class1Total array,
with the names of each row printed together and each individual name printed on a new line
 */