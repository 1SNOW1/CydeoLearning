package day12_customMethods;

import java.util.Scanner;

public class formatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine().trim().replace(" ", "");

        System.out.println("Enter your Last name: ");
        String lastName = input.nextLine().trim().replace(" ", "");

        input.close();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Full name: " +firstName + " " +lastName);



    }
}
