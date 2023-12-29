package day22_arraysList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 1;
        array[1] = 10;
        array[2] = 20;
        array[3] = 30;
        array[4] = 40;

        System.out.println(Arrays.toString(array));


        System.out.println("--------------------------------------------------");


        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());




    }
}