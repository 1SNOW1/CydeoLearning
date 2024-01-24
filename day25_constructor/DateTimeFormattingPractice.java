package day25_constructor;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormattingPractice {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today.format(df));










    }
}
