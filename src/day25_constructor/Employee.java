package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitles;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String jobTitles, double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitles = jobTitles;
        this.salary = salary;
        this.hired_date = hired_date;
        //allows us to set all the instance variables of the object as soon as the object is created


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", jobTitles = '" + jobTitles + '\'' +
                ", salary = " + salary +
                ", hired_date = " + hired_date.format(DateTimeFormatter.ofPattern("MMM/dd/y")) +
                '}';
    }//allows us to print the object when it's passed in the print statement




}
