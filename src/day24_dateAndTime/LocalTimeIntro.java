package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10,30);
        System.out.println(starting_time);

        LocalTime current_time = LocalTime.now();
        System.out.println(current_time);
    }
}
