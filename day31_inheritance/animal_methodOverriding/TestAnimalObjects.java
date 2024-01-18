package day31_inheritance.animal_methodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Simba", "Lion", "Large", "Orange", 'M', 10);

        System.out.println(cat);

        System.out.println("------------------------------------------------------------");


        cat.eat();
        cat.sleep();
        cat.drink(); 


    }
}
