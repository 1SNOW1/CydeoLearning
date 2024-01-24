package day22_arraysList;

public class WrapperClass {

    public static void main (String[] args) {

        String str = "20";
        System.out.println(str + 1);


        //Integer num1 = Integer.parseInt(str); //unboxing

        int num = Integer.parseInt(str); //everytime you use the parse method you will get a primitive value

        System.out.println(num +1);

        int num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("-----------------------------------------------------");

        String s = "20.5";

        double d1 =  Double.parseDouble(s);
        System.out.println(d1);

        Double d2 = Double.valueOf(s);
        System.out.println(d2);

        System.out.println("------------------------------------------------------");


        String x = "false";

        boolean r1 = Boolean.parseBoolean(x); //gives me primitive boolean

        Boolean r2 = Boolean.valueOf(x); //gives me the wrapper class object

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("----------------------------------------------------");


        char ch = '?';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        boolean isSpecialCharacter = !Character.isLetterOrDigit(ch);


        System.out.println(isDigit);
        System.out.println(isLetter);
        System.out.println(isLowerCaseLetter);
        System.out.println(isUpperCaseLetter);
        System.out.println(isSpecialCharacter);

        System.out.println("----------------------------------------------------");

        //here im trying to find the sum of all the digits in the String
        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+ each);



            }
        }

        System.out.println("sum = " + sum);








    }
}
