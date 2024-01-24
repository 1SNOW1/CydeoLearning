package day34_abstraction.carTask;

public class Audi extends Car{

    public Audi(String color, String model, int year, double price) {
        super(color, model, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    public void autoPark(){
        System.out.println(getMake() + " " + getModel() + " has auto parking feature");
    }
}
