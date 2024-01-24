package day34_abstraction.carTask;

public abstract class Car {


    private String color;
    private final String make, model;
    private final int year;
    private double price;

    public Car(String color, String model, int year, double price) {
        setColor(color);
        this.make = getClass().getSimpleName();
        this.model = model;
        if (year < 1886){
            System.err.println("Invalid year:" + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Price cannot be set to lower than or equal to 0: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop(){ // protected because I want to make sure that non-sub classes outside of package will not be able to access it
        System.out.println("Press the brake to stop " + make + " " + model);
    }

    protected abstract void start();

    @Override
    public String toString() {
        return make +"{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price+"$" +
                '}';
    }
}
