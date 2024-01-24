package day23_arrayList;

import java.util.ArrayList;

public class UniqueNumbers2 {

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


        for (Integer element : numbers) {

            int frequency = 0;
            for (Integer each : numbers) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
                break;
            }

        }


    }
}
