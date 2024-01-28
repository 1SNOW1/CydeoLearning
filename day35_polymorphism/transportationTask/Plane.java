package day35_polymorphism.transportationTask;

public abstract class Plane extends Transportation{

    public Plane(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void transportPeople() {
        System.out.println(getMake() + " can transport up to 100 people");
    }

    @Override
    protected void start() {
        System.out.println(getMake() + " has a complex starting mechanism");
    }

    @Override
    protected void stop() {
        super.stop();
    }

    protected void land(){
        System.out.println(getMake() + " is landing safely");
    }
}
