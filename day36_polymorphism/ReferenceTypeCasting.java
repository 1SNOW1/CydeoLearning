package day36_polymorphism;

import day29_inheritance.Animal;
import day29_inheritance.Dog;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Dog dog = new Dog();

        //Cat cat = new Dog()

        Animal animal = (Dog) new Dog(); //implicit casting

        //Dog dog1 = (Dog) new Animal(); //explicit casting


        boolean b1 = dog instanceof Animal;

        System.out.println(b1);


        System.out.println("--------------------------------------------");


        Animal animal1 = new Dog();
        animal1.setInfo("Max", "Large", "Black", "Husky", 'M', 5);

        ((Dog) animal1).bark(); //down casting, one time use only

        Dog dog1 = (Dog) animal1; //down casting
    }
}
