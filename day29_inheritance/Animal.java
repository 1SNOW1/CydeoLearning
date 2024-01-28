package day29_inheritance;

public class Animal {

    private String name, size, color, breed;
    private char gender;
    private int age;

    public void setInfo(String name, String size, String color, String breed, char gender, int age){
        setName(name);
        setSize(size);
        setColor(color);
        setBreed(breed);
        setGender(gender);
        setAge(age);
    }

    /*
    public Animal(String name, String size, String color, String breed, char gender, int age) {
        setName(name);
        setSize(size);
        setColor(color);
        setBreed(breed);
        setGender(gender);
        setAge(age);
    }

     */

    @Override
    public String  toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Name cannot be blank or empty");
            System.exit(1);
        }

        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("Large") || size.equalsIgnoreCase("Normal") || size.equalsIgnoreCase("Small"))){
            System.err.println("Animal size must be set to either large, normal or small");
            System.exit(1);
        }
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank()){
            System.err.println("Color must be given and it cannot be blank or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isBlank() || breed.isEmpty()){
            System.err.println("Breed must be given, and it cannot be blank or empty");
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Gender must be given as M or F");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 25) {
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public void
}
