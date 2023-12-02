package day11_StringMethods;

public class stringMethods3 {

    public static void main(String[] args) {

        String word = "Java";

        boolean r1 = word.isEmpty();

        System.out.println(r1); //will return true/false depending on whether its empty or not

        //---------------------------------------------------------------

        String word1 = "                   ";

        boolean r2 = word1.isEmpty();
        boolean r3 = word1.isBlank();


        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        /*
        isEmpty method will say its true if its actually empty. White space != empty, but white == blank space
        thus blank space will result in a false when isEmpty method is used but it will give true when a isBlank method is used.
         */
        //------------------------------------------------------------------


        String str1 = "Cydeo";

        String str2 = new String("Cydeo");

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));


        String str3 = new String("cydeo");

        System.out.println(str1.equals(str3));

        /*string should me compared with a .equals and not a == since the == will compare the objects and the .equals will compare its values.
        (ps does not ignore case sensitivity)
       */


        //-----------------------------------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //------------------------------------------------------------------


        String students = "Hasan Naran Sumeye Natalia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = " + hasAhmed);



        String sentence = "My favorite programming language is JAVA";
        
        boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);

        //------------------------------------------------------------------


        String sen1 = "Hello michael";

        System.out.println(sen1.startsWith("Hello"));
        System.out.println(sen1.startsWith("michael"));

        System.out.println(sen1.endsWith("michael"));
        System.out.println(sen1.endsWith("Michael"));//endsWith method does not ignore case sensitivity
        
        String url = "www.cydeo.com";
        
        boolean isValid = url.startsWith("www.");

        System.out.println("isValid = " + isValid);
        
        boolean isValid1 = url.endsWith(".com");

        System.out.println("isValid1 = " + isValid1);

        //----------------------------------------------------------


        String email = "CydeoSchool@gmail.com";

        boolean isYahoo = email.endsWith("@Yahoo.com");

        boolean isHotmail = email.endsWith("@hotmail.com");

        boolean isGmail = email.endsWith("@gmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);



        








    }
}
