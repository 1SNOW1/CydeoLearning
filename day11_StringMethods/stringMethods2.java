package day11_StringMethods;

public class stringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love World of Warcraft and its a beautiful game";

        System.out.println(sentence.replace("World of Warcraft", "League of Legends"));


        //-------------------------------------------------------------------------------


        String word = "World of Warcraft";

        System.out.println(word.replace("o", "i"));

        System.out.println(word.replaceFirst("of", "if"));

        //---------------------------------------------------------------------------------


        String word2 = "World of Warcraft is a Warcraft within a World of Warcraft";

        System.out.println(word2.replace("Warcraft", "League"));

        System.out.println(word2.replaceFirst("a Warcraft", "a Java"));

        System.out.println(word2.replaceAll("o", "u"));

        //-------------------------------------------------------------------------------


        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 11);
        System.out.println(languageName);

        //-------------------------------------------------------------------


        String sentence5 = "Today is game day, tomorrow is also game day";

        int index1 = sentence5.indexOf("game");
        System.out.println(index1);

        System.out.println(sentence5.substring(9, 14));

        //-----------------------------------------------------------------

        String email = "cydeoSchoolJavaProgramming@gmail.com";

        int indexOfDomain = email.indexOf("@") + 1;
        int lastIndexOfDomain = email.lastIndexOf(".");

        System.out.println(indexOfDomain);
        System.out.println(lastIndexOfDomain);

        System.out.println(email.substring(indexOfDomain, lastIndexOfDomain));

        //-------------------------------------------------------------------


        String ex = "I love Java programming";

        System.out.println(ex.substring(ex.lastIndexOf('p')));


        //---------------------------------------------------------------------


        String ex1 = "I study World of Warcraft";

        System.out.println(ex1.indexOf("World"));
        String schoolName = ex1.substring(8);
        System.out.println(schoolName);


        //------------------------------------------------------------------


        String str = "Python";

        String result = (str + ", ").repeat(10);

        System.out.println(result);


        //----------------------------------------------------------------


    }
}
