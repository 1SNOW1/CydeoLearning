package day28_encapsulation.PersonTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Enes", 21 );

        Person person2 = new Person("Ömer", "Turkish" , 20, 'M' );

        Person person3 = new Person("Ensar", 18, 'M' );

        Person person4 = new Person("Abubakr", "Arabic" );

        Person person5 = new Person("Lucy", "English", 18, 'F' );

        System.out.println(person1);

        System.out.println(person2);

        System.out.println(person3);

        System.out.println(person4);

        System.out.println(person5);


        person1.drink("a drink");

        System.out.println(Person.planet);
        System.out.println(Person.hasNose);
        System.out.println(Person.numberOfWings);

        person1.eat("bazlama");

    }
}
