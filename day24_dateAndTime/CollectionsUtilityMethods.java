package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Java","Java","Java","C#","C","Ruby","Swift","Swift"));
        System.out.println(students);
        /*
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals("Java")){
                students.set(i, "Python");
            }
        }
        System.out.println(students);

         */

        Collections.replaceAll(students, "Java", "Python");
        System.out.println(students);

        System.out.println("-------------------------------------------------------------");


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,50,50,60,70,70,50,50,60));

        int count = Collections.frequency(list, 59);

        System.out.println(count);
        

        System.out.println("-------------------------------------------------------------");


        ArrayList<String> languages = new ArrayList<>
                (Arrays.asList("Java", "Java", "Java", "C#", "C", "Ruby", "Swift", "Swift"));
        
        int countJava = Collections.frequency(languages, "Java");
        System.out.println("How many times did the language name called Java occur? Answer: " + countJava);


        System.out.println("-------------------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>
                (Arrays.asList(10,20,30,40,50,50,50,50,50,50,60,60,60,70));

        for (Integer unique : numbers) {
            if (Collections.frequency(numbers, unique) == 1){
                System.out.println(unique);
            }
        }







    }
}
