package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Bobby", 'M', LocalDate.of(1980,4,13));
        people[2].setInfo("Rahim", 'M', LocalDate.of(1994,8,18));
        people[3].setInfo("Rukiye", 'F', LocalDate.of(1999,6,21));
        people[4].setInfo("Mark", 'M', LocalDate.of(2001,4,20));

        ArrayList<Person> studentList = new ArrayList<>(Arrays.asList(people));

        studentList.removeIf(p -> p.age > 25);
        // print name & date of birth of each person object
        for (Person person : studentList) {
            System.out.println("Name: " + person.name + ", Date of birth: " + person.dateOfBirth + ", Age: " + person.age);
        }





        //now remove students above 25 years of age


        }




    }
