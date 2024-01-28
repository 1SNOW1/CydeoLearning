package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable {

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    //overriding the methods from the parent class
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats meat, for instance fish and deer");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " barely sleeps");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is a muslim and prefers ZemZem water before anything else");
    }

    //overriding the methods from Flyable interface

    public void isFlying(){
        System.out.println(getBreed() + " can reach 4500m above sea levels");
    }


    @Override
    public void fly() {

    }
}
