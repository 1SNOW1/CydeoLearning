package day8_ternary_switch;

public class ternaryIntro3 {

    public static void main(String[] args) {

        int score = 50;

/*
        String result = "";
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                result = "passed";
            }
            else {
                result = "failed";
            }
        }
        else {
            result = "invalid";
        }
        System.out.println(result);
 */


        String result = (score >= 0 && score <= 100)?
                            (score >= 60)? "passed" : "failed" :
                                "invalid";
        System.out.println(result);

        System.out.println("------------------------------------------------------");




        int n = 5;


    }
}
