package day40_collections;

import java.util.*;
public class CollectionPractice {

    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();
        list.add(100);
        list.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700));

        System.out.println(list);

        System.out.println(((ArrayList)list).get(2));

        System.out.println("-----------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection2);

        //System.out.println( ((ArrayList) collection2).get(4));

        System.out.println( new ArrayList<>(collection2));
    }
}
