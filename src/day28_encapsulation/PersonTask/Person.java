package day28_encapsulation.PersonTask;

public class Person {

    public String name, language;
    public int age;
    public char gender;


    public static boolean isHuman, hasNose;
    public static int numberOfHead, numberOfWings;
    public static String planet;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, String language) {
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this(name,age);
        this.gender = gender;
    }

    public Person(String name, String language, int age, char gender) {
        this(name, age, gender);
        this.language = language;
    }

    static {
        numberOfHead = 1;
        planet = "Earth";
        numberOfWings = 0;
        isHuman = true;
        hasNose = true;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is: " +planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);

    }

    public void drink (String drink){
        System.out.println(name + " is drinking " + drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", numberOfWings=" + numberOfWings +
                ", gender=" + gender +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", numberOfHead=" + numberOfHead +
                ", planet=" + planet +
                '}';
    }
}
