package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {

        // create an arrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(250);
        numbers.add(325);
        numbers.add(445);
        numbers.add(555);
        numbers.add(666);
        numbers.add(777);

        //create an empty bag
        int sum = 0;

        //iterate and add each iteration to the empty bag and let it sum it up.
        for (Integer allNumbers : numbers) {
            sum += allNumbers;
        }

        //calculate the average
        int average = sum / numbers.size();

        System.out.println("numbers = " + numbers);
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);


    }
}
