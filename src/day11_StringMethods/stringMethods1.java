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


        //--------------------------------


        String sentence1 = "Today is a bad day to study yet i need to";

        int index1 = sentence1.indexOf("yet");

        System.out.println(index1);

        String sentence2 = "I love java programming";

        int firstA =  sentence2.indexOf('a');

        System.out.println(firstA);

        int secondA = sentence2.indexOf("a ");

        System.out.println(secondA);

        String sentence3 = "Java Python JavaScript Cydeo Python";

        int a1 = sentence3.indexOf('a');

        System.out.println(a1);

        int a2 =  sentence3.indexOf("va");

        System.out.println(a2);

        int a3 = sentence3.indexOf("Python");
        System.out.println(a3);

        // ----------------------------------------------------------------------


        String w = "java";

        System.out.println(w.indexOf('a') );
        System.out.println(w.lastIndexOf('a'));

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println( w2.lastIndexOf('a'));
        System.out.println( w2.lastIndexOf('o'));
        System.out.println( w2.replaceFirst("Java", "Warcraft"));





    }
}
