package day25_constructor;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dog {

    public String name;
    public String race;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String name, String race, int age, char gender, String size, String color) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
