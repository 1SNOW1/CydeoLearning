package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {

    public static void main(String[] args) {

        CydeoDevStudent Dev1 = new CydeoDevStudent("Enes", 'M', LocalDate.of(2002,4,13), "123", "ZeRo tO HeRo", 1);

        System.out.println(Dev1);

        Dev1.sleep();

    }

}
