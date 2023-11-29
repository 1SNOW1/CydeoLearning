package day10_Scanner_String;

public class stringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        // index :    01234

        char firstChar = str.charAt(3);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);

        System.out.println(firstChar);

        System.out.println(secondChar);

        System.out.println(thirdChar);

        System.out.println("------------------------------------------------");





        String sentence = "Java programming language";


        int length = sentence.length();


        System.out.println(length);

        int lastIndex = length -1;

        System.out.println(lastIndex);

        System.out.println("------------------------------------------------");



        String s1 = "Wooden spoon";

        char firstChar1 = s1.charAt(0);
        int length1 = s1.length();
        System.out.println(length1);
        char lastChar1 = s1.charAt(11);
        System.out.println(firstChar1 + " and " + lastChar1);


        System.out.println("------------------------------------------------");








    }
}
