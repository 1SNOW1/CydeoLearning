package day22_arraysList;

public class WarmUpTaskMultiDimensional {

    public static void main(String[] args) {

        //Define three 1D arrays
        int[] nums1 = {10, 20, 34, 65};
        int[] nums2 = {23, 45, 68, 56};
        int[] nums3 = {53, 87, 98, 34, 110};

        //Create a 2D array containing the three 1D arrays
        int[][] allNums = {nums1, nums2, nums3};

        //Initialize variables to store the maximum and minimum values
        int max = allNums[0][0];
        int min = allNums[0][0];

        //Iterate over the rows of the 2D array
        for (int i = 0; i < allNums.length; i++) {

            //Iterate over the columns of the current row
            for (int j = 0; j < allNums[i].length; j++) {

                //check if the current element is greater than the current maximum
                if (allNums[i][j] > max) {
                    //if yes, update the minimum value
                    max = allNums[i][j];
                }
                //check if the current element is smaller than the current minimum
                if (allNums[i][j] < min) {
                    //if yes, update the minimum value
                    min = allNums[i][j];
                }

            }
        }

        //print the max and min values
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
