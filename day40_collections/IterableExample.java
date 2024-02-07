package day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,7));

        //list.removeIf(p -> p % 2 != 0);
       /* list.removeIf(p -> p < 5);
        System.out.println(list);

        */
       /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5){
                list.remove(i);
            }

        }
        System.out.println(list);

        */
        System.out.println("--------------------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,7));

       Iterator<Integer> it = list2.iterator();

       while (it.hasNext()){
          Integer each = it.next();
          if (each < 5){
              it.remove();
          }
       }
        System.out.println(list2);


        System.out.println("--------------------------------------------------------------");


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,7));

        for (Iterator<Integer> i = list3.iterator();  i.hasNext(); ){
           Integer each = i.next();
           if (each < 5){
               i.remove();
           }
        }
        System.out.println(list3);


    }
}
