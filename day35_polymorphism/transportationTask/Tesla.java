package day35_polymorphism.transportationTask;

public class Tesla extends Car implements Electric, AutoPark, AutoPilot{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void autoPilot() {

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
    public void drive() {

    }

    @Override
    public void charge() {

    }
}
