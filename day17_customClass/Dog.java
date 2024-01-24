package day17_customClass;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public int age;
    public String color;


    public void setInfo(String name, String breed, String size, String color, int age){
        this.name = name; //this keyword is used for calling the instance variable name
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking" );
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
