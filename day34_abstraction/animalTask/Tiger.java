package day34_abstraction.animalTask;

public class Tiger extends Animal1 implements WildAnimal{
    public Tiger(String name, String gender, String color, int age) {
        super(name, gender, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+getName() +" is eating deer");
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
}
