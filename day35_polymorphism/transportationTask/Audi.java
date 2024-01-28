package day35_polymorphism.transportationTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void transportPeople() {
        super.transportPeople();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " has autoPark feature");
    }

    @Override
    protected void drive() {
        System.out.println(getMake() + " can be driven by Enes");
    }
}
