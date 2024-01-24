package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));


        System.out.println("-----------------------------------------");


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        // groceriesList[0] = "Oranges"; this does not work on arraylist, does work on arrays tho
        groceriesList.set(0, "Oranges"); //set method does not change the size of the arrayList, it simply replaces the old index with a new one
        System.out.println(groceriesList);

        System.out.println("-----------------------------------------");

        groceriesList.remove(0);
        System.out.println(groceriesList);

        groceriesList.remove(0);
        System.out.println(groceriesList);

        System.out.println("-----------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 = numbers.remove(Integer.valueOf(10)); //here the 10 given inside valueOf method is counted as an object thus autoboxing is happening here
        System.out.println(numbers);
        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("-----------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.lastIndexOf("Sumeye"));

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);


        System.out.println("-----------------------------------------");


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);


        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        System.out.println("-----------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(20);
        n2.add(10);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        System.out.println(n1.isEmpty());

        n1.clear();
        System.out.println(n1.isEmpty());


    }
}
