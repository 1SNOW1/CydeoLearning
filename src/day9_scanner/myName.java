package day9_scanner;


import java.util.Scanner;

public class myName {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter you age: ");

        int age = input.nextInt();

        System.out.println("Enter you full name: ");

        input.nextLine(); /*so without this code the following part of the code wont work as you want it to
                            meaning you wont be able to type you full name,
                            it will just be empty.
                           */

        String full_name = input.nextLine();
        input.close();

        System.out.println("You are "+age+" years old");
        System.out.println("Your name is "+full_name);
    }
}
