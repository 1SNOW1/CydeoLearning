package day26_statics;

public class CarTask2 {

    public String make, model;
    public int year;
    public double price;
    public String color;

    public CarTask2(String make) {
        this.make = make;
    }

    public CarTask2(String make, String model) {
        this(make); //this.make = make;
        this.model = model;
    }

    public CarTask2(String make, String model, int year) {
        this(make,model);
        this.year = year;
    }

    public CarTask2(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

    public CarTask2(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarTask2{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {


        CarTask2 car1 = new CarTask2("BMW", "SOUL", 2023, 500_000.00, "Grey");

        System.out.println(car1);

        CarTask2 car2 = new CarTask2("AUDI");

        System.out.println(car2);

    }
}
