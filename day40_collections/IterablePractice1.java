package day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice1 {

    public static void main(String[] args) {

        List<String> names =
                new ArrayList<>(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulija", "Chris"));

        Iterator<String> name = names.iterator();

        while (name.hasNext()){
           String each = name.next();
            if (each.equalsIgnoreCase("ahmed")){
                name.remove();
            }
        }
        System.out.println(names);

        System.out.println("----------------------------------------------------------------------");

        List<String> names2 =
                new ArrayList<>(Arrays.asList("Ahmed", "ahmed", "aHmEd", "John", "Ercan", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yulija", "Chris"));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);

        System.out.println("----------------------------------------------------------------------");



    }
}
