package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthDay = LocalDate.of(2002, 4, 13); //once a object is created it will not change, its immutable

        System.out.println(birthDay);

        System.out.println("-------------------------------------------------------------");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(birthDay.getDayOfWeek());

        System.out.println("-------------------------------------------------------------");

        //you have to assign it to itself to make sure the new information is stored and will be displayed
        today = today.plusYears(1);
        System.out.println(today);

        System.out.println("-------------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6,4);

        System.out.println(graduationDate);
        System.out.println(graduationDate.getDayOfWeek());
        System.out.println(graduationDate.getDayOfMonth());

        graduationDate = graduationDate.plusYears(2);
        graduationDate = graduationDate.plusMonths(7);
        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);
        System.out.println(graduationDate.getDayOfWeek());
        System.out.println(graduationDate.getDayOfMonth());

        System.out.println("-------------------------------------------------------------");


        LocalDate yourBirthDay = LocalDate.of(2005,4,1);

        LocalDate yourBrotherBirthday = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay);
        System.out.println(yourBrotherBirthday);

        boolean r1 = yourBirthDay.isAfter(yourBrotherBirthday);
        boolean r2 = yourBirthDay.isEqual(yourBrotherBirthday);
        System.out.println(r1);
        System.out.println(r2);

        boolean leapYear = yourBirthDay.isLeapYear();
        System.out.println("leapYear = " + leapYear);


        System.out.println("-------------------------------------------------------------");


        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));



    }
}
