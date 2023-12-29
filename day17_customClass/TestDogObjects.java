package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {


        Dog dog1 = new Dog();

        dog1.name = "Maximilian";
        dog1.breed = "Kangal";
        dog1.age = 10;
        dog1.color = "Black";
        dog1.size = "Large";

        dog1.eat();
        System.out.println(dog1);

        Dog dog2 = new Dog();

        dog2.name = "Bella";
        dog2.breed = "Kangal";
        dog2.size = "Small";
        dog2.age = 10;
        dog2.color = "Brown";

        dog2.eat();
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Loki", "timberwolf", "large", "black", 10);
        System.out.println(dog3);
        dog3.eat();
    }
}
