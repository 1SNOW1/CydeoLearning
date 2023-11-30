package day11_StringMethods;


public class stringMethods1 {

    public static void main(String[] args) {


        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase();

        System.out.println(str1);


        //-----------------------------------------------



        String s1 = "java programming";

        s1 = s1.toUpperCase(); // "JAVA PROGRAMMING"

        System.out.println(s1);

        //---------------------------------------------------


        String word = "Wooden Spoon";

        word.toUpperCase(); //"WOODEN SPOON"

        word.toLowerCase(); //"wooden spoon"

        System.out.println(word);

        word = word.toUpperCase();

        System.out.println(word);

        word = word.toLowerCase();

        System.out.println(word);
/*
The actual string object itself won't change because its immutable,
at the end of the day it will only create a new string object where the new assigned value will be shown
but the original string value will still be memorized by the string heap memory.
 */

//------------------------------------------------------------------------




        //white space is unnecessary space

        String p1 = "                        Cydeo School";
        p1.trim();
        p1 = p1.trim();
        System.out.println(p1);

    }
}
