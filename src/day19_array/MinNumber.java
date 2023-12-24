package day19_array;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,-10}; // I declare an array

        int min = numbers[0]; // I make an assumption that the first number is the smallest number

        /*I compare every number with the first number and,
         when the comparison comes up with a smaller number
         than the first one it gets replaced with the smaller number
         */
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min ){
                min = numbers[i];
            }
        }

        //I print the code
        System.out.println("min = " + min);
    }
}
