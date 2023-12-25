package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        //since we are using a toString method, it means we can also assign it to a string as I do below
        String result = Arrays.toString(score);
        //and then you can print it and get the same representation of the array
        System.out.println(result);

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        //the equals method will only say true if the order and information is the same otherwise it will say false
        boolean b1 = Arrays.equals(a1,a2);//this is true because they are identical
        System.out.println(b1);

        char[] c1 = {'A', 'B', 'C'};
        char[] c2 = {'A', 'C', 'C'};
        //this is false because regardless the information it contains, the order in which it was passed is not identical thus its false
        boolean b2 = Arrays.equals(c1, c2);
        System.out.println(b2);


        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","C","B"};
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        //this is also false because they might be the same elements, but they still lack the same order
        System.out.println(Arrays.equals(s1,s2));


        System.out.println("---------------------------------------------");

        int[] nums = {100,80,90,75,88,99,54,58,23,79,68,99,150};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);

        System.out.println("---------------------------------------------");

        String[] str1 = {"A", "B", "C"};
        String[] str2 = {"A", "C", "B"};

        Arrays.sort(str1);
        Arrays.sort(str2);

        System.out.println(Arrays.equals(str1, str2));

        System.out.println("---------------------------------------------------");
        //declaration of array
        String[] students = {"Madivar", "Ali", "Abdullah", "Alena", "Yaxier"};
        //printing of array
        System.out.println(Arrays.toString(students));
        //sorting of array
        Arrays.sort(students);
        //re-printing of array
        System.out.println(Arrays.toString(students));

        System.out.println("----------------------------------------------------");

        int[] array1 = {10,20,30,40,50,60,70};

        int[] array2 = Arrays.copyOf(array1, 9 );
        System.out.println(Arrays.toString(array2));

        System.out.println("---------------------------------------------------");

        int[] n1 = {1,2,3,4,5,6};
        int[] n2 = {7,8,9,10,11,12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        System.out.println(Arrays.toString(n3));

        for (int i = 0, j = n1.length -1; i < n2.length ; i++, j++) {

            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("--------------------------------------------------");

        char[] ch = {'A','B','C','D','E','F','G'};
        char[] result1 = Arrays.copyOf(ch, ch.length);

        System.out.println(Arrays.toString(result1));

       char[] result2 = Arrays.copyOfRange(ch, 2, ch.length);
        System.out.println(Arrays.toString(result2));

    }

}
