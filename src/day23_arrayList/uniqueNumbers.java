package day23_arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class uniqueNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);

        Set<Integer> uniqueElements = new HashSet<>();
        int hasAppearedBefore = 0;

        for (Integer unique : numbers) {
            //check if the number has not appeared before
            if (!uniqueElements.contains(unique)){
                uniqueElements.add(unique);
            }else{ //if it's a duplicate it will be added to the empty int bag called hasAppearedBefore
                hasAppearedBefore += unique;
            }
        }

        System.out.println("uniqueElements = " + uniqueElements);
        System.out.println("hasAppearedBefore = " + hasAppearedBefore);



        
        
    }
}
