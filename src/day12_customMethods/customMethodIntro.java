package day12_customMethods;

public class customMethodIntro {

    public static void main(String[] args){

        System.out.println("Test started");
        greetings();
        System.out.println("Test completed");

        System.out.println("----------------------------------");

        sup();
    }

    public static void greetings(){

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java?");
    }


    public static void sup(){

        System.out.println("Sup homie! Wanna do some 2s?");
        int addition = 2 + 2;
        System.out.println("2 + 2 = " + addition);
    }
}
