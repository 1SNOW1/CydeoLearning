package day41_maps;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7,8,9,10,11,12));

        List<List<Integer>> lists = new ArrayList<>(Arrays.asList(list1,list2));

        System.out.println(lists);

        System.out.println(lists.get(1).get(3));

        //if i want to get each element in the lists displayed one by one

        for (List<Integer> each : lists) {
            System.out.println(each);
            for (Integer elements : each) {
                System.out.println(elements);
            }
        }

        System.out.println("---------------------------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>(Arrays.asList(new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>()));

        listOfSets.get(0).addAll(Arrays.asList(10, 5 ,20));
        listOfSets.get(1).addAll(Arrays.asList(25, 15 ,30));
        listOfSets.get(2).addAll(Arrays.asList(999, 9999 ,11111));
        listOfSets.get(3).addAll(Arrays.asList(123, 456 ,7890));

        System.out.println(listOfSets);
        //List<int [][]> l = new ArrayList<>();


        System.out.println("---------------------------------------------------------");

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};

        List<int[]> listOfArrays = new ArrayList<>(Arrays.asList(arr1,arr2));

        System.out.println(Arrays.toString(listOfArrays.get(0)));
        System.out.println(Arrays.toString(listOfArrays.get(1)));

        listOfArrays.get(0)[2] = 35;

        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("---------------------------------------------------------");




    }
}
