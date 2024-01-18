package day31_inheritance.vehicleTask;

public class Bike extends Vehicle{

    public Bike(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void ride(String Bike){
        System.out.println("Bike is ready to ride = " + Bike);
    }
}
