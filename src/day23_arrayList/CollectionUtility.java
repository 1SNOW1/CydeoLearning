package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        int max = Collections.max(list); // wrapper class --> int = unboxing
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,9,8,6,8,4,3,2,3,7,1));
        Collections.sort(list1);

        System.out.println("list1 = " + list1);

        System.out.println("---------------------------------------------------");

        Collections.reverse(list1);
        System.out.println("list1 = " + list1);


        System.out.println("---------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abdullah", "Bilal"));

        Collections.swap(students, 0, 1);

        System.out.println(students);
    }
}
