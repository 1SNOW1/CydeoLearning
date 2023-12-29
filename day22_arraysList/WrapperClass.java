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









    }
}
