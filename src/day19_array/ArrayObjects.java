package day19_array;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50}; //located in heap because it's an object
        int[] arr2 = arr1;  //memory in stack because it's a ref. var.
        int[] arr3 = arr2;  //memory in stack because it's a ref. var.
                            //so one object can be reffed. by multiple var.
        arr1[0]  = 1000;
        arr1[2]  = 3000;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        System.out.println("_----------------------------------------------");


        String[] a1 = {"Umran", "Mehmet"}; //here ive declared an array
        a1 = new String[]{"James", "Daniel"}; //here i re-declare it so it has a new value and the old one is ready for garbageCollection

        System.out.println(Arrays.toString(a1));

    }
}
