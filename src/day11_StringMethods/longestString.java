package day11_StringMethods;

import java.util.Scanner;

public class longestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first string: ");
        String first = input.nextLine();

        System.out.println("Enter your second string: ");
        String second = input.nextLine();

        input.close();

        if (first.length() > second.length()){
            System.out.println("First string is the longest");
        } else if (first.length() < second.length()) {
            System.out.println("Second string is the longest");
        }
        else {
            System.out.println("Equal");
        }
    }
}
