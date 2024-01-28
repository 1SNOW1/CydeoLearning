package day35_polymorphism.transportationTask;

public abstract class Transportation {

    //initializing instance variables as well as final variables (unchangeable variables)
    private final String make, model;
    private String color;
    private final int year;
    private double price;

    //Constructor
    public Transportation( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    //Getters and Setters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected abstract void transportPeople();
    protected abstract void start();

    protected void stop(){
        System.out.println("Shut off the engine");
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price + "$" +
                '}';
    }
}
