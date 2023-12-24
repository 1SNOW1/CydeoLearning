package day19_array;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] ascending = new char[26]; //index : 0-25
        char[] descending = new char[26];

        for (int i = 0 , j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j; //I explicit cast j to dataType char so that it can represent the ASCII value and that j is assigned to whatever "i" var. is on
            descending[i] = (char) k; //does the same thing mentioned above but does it in reversed order, meaning instead of going A-Z it goes Z-A
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        System.out.println("--------------------------------------------");

        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;

        }

        System.out.println(Arrays.toString(characters));
    }
}
