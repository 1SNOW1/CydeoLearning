package day34_abstraction.animalTask;

public class Shark extends Animal1 implements WildAnimal, Swimmable{
    public Shark(String name, String gender, String color, int age) {
        super(name, gender, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Shark " +getName()+" is eating fish");
    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void drink() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public void swim() {

    }
}
