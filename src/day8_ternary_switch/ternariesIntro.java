package day8_ternary_switch;

public class ternariesIntro {

    public static void main(String[] args) {

        int score = 30;

        String result = "";

        if (score >= 50) {
            result = "Passed";
        }
        else {
            result = "Failed";
        }

        System.out.println(result);


        String result2 = (score >= 60 && score <= 100) ? "Passed" : "Failed";

        System.out.println(result2);


        System.out.println("-----------------------------------------------------------------------");


        int age = 34;
       /*

        String r;
        if(age >= 21) {
            r = "eligible";
        }
        else{
            r = "not eligible";
        }
        */

        String result3 = (age >= 21) ? "eligible" : "not eligible";

        System.out.println(result3);

        System.out.println("------------------------------------------------------------------------");
    }
}

