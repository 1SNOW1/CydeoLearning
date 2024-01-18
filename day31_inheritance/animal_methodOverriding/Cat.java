package day31_inheritance.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }


    public void eat(){
        System.out.println(getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleep more than 10 hours a day");
    }
}
