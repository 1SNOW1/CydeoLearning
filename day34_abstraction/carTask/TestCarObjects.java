package day34_abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

        Kia kia = new Kia("Grey", "Soul", 1887, 50000);

        System.out.println(kia);

        kia.start();
        kia.stop();

        System.out.println("----------------------------------");

        Audi audi = new Audi("Black", "A4", 2020, 60000);

        System.out.println(audi);

        audi.start();
        audi.stop();
        audi.autoPark();
    }
}
