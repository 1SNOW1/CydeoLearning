package day19_array;

import java.util.Arrays;

public class ArraysLiteral {

    public static void main(String[] args) {

//if you know the exact amount of elements but, you don't know what the values are then you use this method
        int[] numbers = new int[5];
//if you know both the numbers of elements and the values of each then you use this method
        int[] nums = {10, 20, 30, 40, 50};


        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("numbers = " + Arrays.toString(numbers));


        System.out.println("-----------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int n = 1;

        System.out.println(days [n]);


        System.out.println("----------------------------------------------------");

        int[] numbers2 = {};


    }
}
