package day11_StringMethods;

import java.util.Scanner;

public class digitLetterSpecialChar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        if (str.length() >= 1) { //if the string has at least one character

            char f = str.charAt(0); //the first character of string

            if(f >= '0' && f <= '9'){
                System.out.println("first char is a digit");
            } else if (f >= 'A' && f <= 'Z'){
                System.out.println("first character is uppercase letter");
            } else if (f >= 'a' && f <= 'z'){
                System.out.println("first character is a lowercase letter");
            } else{
                System.out.println("first character is a special character");
            }


        } else {
            System.out.println("String is empty");
        }

    }
}