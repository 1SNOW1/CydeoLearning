package day8_ternary_switch;

public class ternaryIntro2 {

    public static void main(String[] args) {

        int number = -1;

        /*
        String result = "";
        if(number > 0) {
            result = "Positive";
        }
        else if (number < 0 ) {
            result = "Negative";
        }
        else{
            result = "Zero";
        }
        System.out.println(result);

         */
    String result = (number > 0) ? "Positive" :(number < 0)? "Negative" : "Zero";

        System.out.println("--------------------------------------------------------------------");



    /*
        String day = "";
        if (n == 1){
            day = "monday";
        }
        else if (n == 2){
            day = "tuesday";
        }
        else if (n == 3){
            day = "wednesday";
        }
        else if (n == 4){
            day = "thursday";
        }
        else if (n == 5){
            day = "friday";
        }
        else if (n == 6){
            day = "saturday";
        }
        else if (n == 7){
            day = "sunday";
        }
        System.out.println(day);

     */

        int n = 6;

        String day = (n == 1) ? "monday" :(n==2)? "tuesday" :(n==3)? "wednesday" :(n==4)? "thursday" :(n==5)? "friday" :(n==6)? "saturday" :(n==7)? "sunday" : "no such day";

        System.out.println(day);

        System.out.println("----------------------------------------------------------------------------------------------------");


        int num = 10; // 1-12

        String month = (n == 1) ? "january" :(n==2)? "february" :(n==3)? "mars" :(n==4)? "april" :(n==5)? "may" :(n==6)? "june" :(n==7)? "jule" :(n==8)? "august":(n==9)? "september":(n==10)? "october" :(n==11)? "november" :(n==12)? "december" : "no such month";

        System.out.println(month);
    }

}
