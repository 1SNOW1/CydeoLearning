package day35_polymorphism.transportationTask;

public class TestTransportationObjects {

    public static void main(String[] args) {

        Audi audi = new Audi("A7", "Matt black", 2023, 1000000);

        System.out.println(audi);

        audi.autoPark();
        audi.drive();

    }
}
