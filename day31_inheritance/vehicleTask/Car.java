package day31_inheritance.vehicleTask;

public class Car extends Vehicle {

    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(String Car){
        System.out.println("Cars ready to drive: " + Car);
    }
}
