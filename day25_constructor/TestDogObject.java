package day25_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

public class TestDogObject {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Luke", "Husky", 4, 'M', "Large", "Black");
        dogs[1].setInfo("Max", "Golden Retriever", 5, 'M', "Large", "Black");
        dogs[2].setInfo("Chloe", "Beagle", 5, 'F', "Medium", "Black");
        dogs[3].setInfo("Molly", "Bulldog", 5, 'F', "Large", "Black");
        dogs[4].setInfo("Oliver", "Bichon Frise", 4, 'M', "Small", "Black");
        dogs[5].setInfo("Loki", "Chow Chow", 5, 'M', "Small", "Black");

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog> youngDogs = new ArrayList<>();

        for (Dog dog : dogs) {
            if (dog.age <= 4){
                System.out.println("Name: " + dog.name + ", Race: " +dog.race + ", Age: " + dog.age);
            }
        }


        System.out.println("---------------------------------------------------------------------------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Luke", "Husky", 4, 'M', "Large", "Black");
        dogs2[1].setInfo("Max", "Golden Retriever", 5, 'M', "Large", "Black");
        dogs2[2].setInfo("Chloe", "Beagle", 5, 'F', "Medium", "Black");
        dogs2[3].setInfo("Molly", "Bulldog", 5, 'F', "Large", "Black");
        dogs2[4].setInfo("Oliver", "Bichon Frise", 4, 'M', "Small", "Black");
        dogs2[5].setInfo("Loki", "Chow Chow", 5, 'M', "Small", "Black");

        ArrayList<Dog> smallDogs2 = new ArrayList<>(Arrays.asList(dogs2));
        smallDogs2.removeIf(p -> p.size.equalsIgnoreCase("small"));

        dogs2 = smallDogs2.toArray(new Dog[smallDogs2.size()]);

        System.out.println(Arrays.toString(dogs2));


    }
}
