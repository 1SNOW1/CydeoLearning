package day20_forEach;

import Utilities.ArraysUtility;
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("--------------------------------------------");


        String str2 = "today is a great day to learn java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------");

        String sentence = "I love java";

        //This is a way of doing it, but you could do it the way I did it below
        String[] sentence1 =  ArraysUtility.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(sentence1));

        //sentence1 = ArraysUtility.reverse(sentence1);

        //System.out.println(Arrays.toString(sentence1));

        //Now im going to take each word out of the array to turn it into a sentence

        String reversedSentence = "";

        for (int i = 0; i < sentence1.length; i++) {
            //this code below adds for each index in sentence1 array, a space and the word itself into the empty String I created called reversedSentence
            reversedSentence += sentence1[i] + " ";

        }
        System.out.println(reversedSentence);
    }
}
