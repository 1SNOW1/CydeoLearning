package day31_inheritance.animal_methodOverriding;

public class Animal {

    private String name, breed, size, color;
    private char gender;
    private int age;

    public Animal(String name, String breed, String size, String color, char gender, int age) {
         setName(name);
         setBreed(breed);
         setSize(size);
         setColor(color);
         setGender(gender);
         setAge(age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    public void eat(){
        System.out.println(name + " is eating food");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }



}
