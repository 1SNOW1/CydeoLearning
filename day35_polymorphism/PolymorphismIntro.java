package day35_polymorphism;

import day33_abstraction.employeeTask.Developer;
import day33_abstraction.employeeTask.Employee;
import day33_abstraction.employeeTask.Teacher;
import day35_polymorphism.transportationTask.Car;
import day35_polymorphism.transportationTask.Tesla;

public class PolymorphismIntro {

    public static void main(String[] args) {


        Developer developer = new Developer("Lucy", "Female", "Developer", "123", 1000000, "Java" );
        Teacher teacher = new Teacher("Enes", "Male", "Teacher", "1234", 100000);


        Object[] employees = { teacher, developer};

        Employee obj = new Developer("Lucy", "Female", "Developer", "123", 1000000, "Java" );

        obj.work();

        System.out.println("------------------------------------------------------------");


        Car car1 = new Tesla("Model Y", "White", 2020,55000);

        car1.start();
        //car1.autoPilot();

    }
}
