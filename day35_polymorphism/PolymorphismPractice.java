package day35_polymorphism;

import day34_abstraction.animalTask.Animal;
import day34_abstraction.animalTask.Eagle;
import day34_abstraction.animalTask.Flyable;
import day34_abstraction.animalTask.Tiger;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "Male", "Orange", 5 );

        tiger.eat();
        tiger.hunt();

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "black & white");

        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "black & white");

        obj1.fly();


    }
}
