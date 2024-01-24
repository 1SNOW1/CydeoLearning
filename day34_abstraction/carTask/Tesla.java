package day34_abstraction.carTask;

public class Tesla extends Car{

    public Tesla(String color, String make, String model, int year, double price) {
        super(color, model, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use voice control to start " + getMake() + " " + getModel());
    }

    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " has auto pilot feature");
    }
}
