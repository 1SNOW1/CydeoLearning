package day39_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        //arrayList --------------------------------------------

        List<Integer> arrayList = new ArrayList<>(); // Array based class ===> get() is faster (random access)
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.get(0);

        //linkedList ------------------------------------------
        List<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked list) ===>  add(), addAll(), remove(), removeAll(),
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("---------------------------------------------------------");


        Vector<Integer> vector = new Vector<>();

       /* vector.add(0);
        vector.remove(0);
        vector.get(0);

        */


        System.out.println("---------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();
/*
        stack.add(0);
        stack.remove(0);
        stack.get(0);


 */

        System.out.println("---------------------------------------------------------");

        Set<Integer> set1 = new HashSet<>(); //order is random
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set1 + ", this is HashSet");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set2 + ", this is LinkedHashSet");


        System.out.println("---------------------------------------------------------");


        String str = null;
        //System.out.println(str.toLowerCase());

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //set3.addAll(Arrays.asList(null, null, null, null)); TreeSet does not accept null

        System.out.println(set3 + ", this is TreeSet");


        System.out.println("---------------------------------------------------------");


        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#", "C#"};

        Set<String> result = new LinkedHashSet<>(Arrays.asList(words));

        System.out.println(result);

        /*
        for (String each : result) {
            System.out.println(each);
        }

        */


    }
}
