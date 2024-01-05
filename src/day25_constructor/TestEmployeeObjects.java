package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Enes", 21, 'M', "Game Developer", 150_000, LocalDate.of(2022,12,1));
        Employee e2 = new Employee("Ömer", 20, 'M', "Java Developer", 150_000, LocalDate.of(2022,12,1));
        Employee e3 = new Employee("Ensar", 18, 'M', "Game Developer", 150_000, LocalDate.of(2022,12,1));
        Employee e4 = new Employee("Gizem", 22, 'F', "Lawyer", 150_000, LocalDate.of(2022,12,1));
        Employee e5 = new Employee("Hatice", 23, 'F', "Poet", 150_000, LocalDate.of(2022,12,1));

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

    }

}
