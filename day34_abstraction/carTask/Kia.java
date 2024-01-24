package day34_abstraction.carTask;

public class Kia extends Car{

    public Kia(String color, String model, int year, double price) {
        super(color, model, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Twist the key to ignition to start " + getMake()+ " " + getModel());
    }


}
