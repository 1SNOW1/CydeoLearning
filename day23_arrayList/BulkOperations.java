package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(numbers);

        System.out.println(list1);


        System.out.println("---------------------------------------------------");
//addAll method

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(76, 45, 67, 87, 10));

        System.out.println(scores);

        System.out.println("---------------------------------------------------");
//addAll method
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abdullah", "Bilal"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));
        System.out.println(students);

        System.out.println("---------------------------------------------------");


        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        //l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("---------------------------------------------------");
//containsAll method
        //l1.removeAll(Arrays.asList(nums));
        //System.out.println(l1);

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));


        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);


        System.out.println("---------------------------------------------------");
//removeAll method, removes every matching element (within the given elements)
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,20,20,20));

        list.removeAll(Arrays.asList(10,20));

        System.out.println(list);


        System.out.println("---------------------------------------------------");
//retainAll, remove anything and everything but the selected ones
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashavar", "Madivar", "Muhtar", "Muhtar"));

        developers.retainAll(Arrays.asList("Alena", "Khashavar","Muhtar"));

        System.out.println(developers);



        System.out.println("---------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(
                Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels")
        );

        System.out.println(groceriesList);

        groceriesList.retainAll(Arrays.asList("Eggs","Potato","Milk","Tomato"));

        System.out.println(groceriesList);
    }
}
