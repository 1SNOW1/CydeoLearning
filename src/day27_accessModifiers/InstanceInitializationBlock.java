package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;


    {
        name = "James";
        age = 20;

    }


    public static void main(String[] args) {

        InstanceInitializationBlock ob1 = new InstanceInitializationBlock();
        InstanceInitializationBlock ob2 = new InstanceInitializationBlock();

        System.out.println(ob1.name);
        System.out.println(ob2.name);

        System.out.println(ob1.age);
        System.out.println(ob2.age);
    }
}
