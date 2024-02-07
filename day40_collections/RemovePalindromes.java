package day40_collections;

import Utilities.StringUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names =
                new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "level", "civic", "radar", "kayak", "reviver", "racer", "Yulija", "Chris"));

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();

            String reverse = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse)){
                //names.remove(each);
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("------------------------------------------------");

        List<String> names2 =
                new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "level", "civic", "radar", "kayak", "reviver", "racer", "Yulija", "Chris"));

        names2.removeIf(p -> StringUtilities.reverse(p).equalsIgnoreCase(p) );

        System.out.println(names2);


        System.out.println("-------------------------------------------------");
    }
}
