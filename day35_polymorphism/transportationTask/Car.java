package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation {

    public Car(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void transportPeople() {
        System.out.println(getMake() + " can transport up to 7 people");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {
        super.stop();
    }

    public abstract void drive();


}
