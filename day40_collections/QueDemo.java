package day40_collections;

import java.util.*;

public class QueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>(); //que order is random, null is not accepted
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue1);

        int num1 = queue1.poll(); // ===> FIFO
        queue1.poll();
        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);
        System.out.println(num1);

        Queue<Integer> queue2 = new ArrayDeque<>();

        Queue<Integer> queue3 = new LinkedList<>();

        System.out.println("------------------------------------------");




    }
}
