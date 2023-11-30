package day8_ternary_switch;

public class ifStatementAndTernariesPractice {

    public static void main(String[] args) {

        int score = 90;

        String result = "";

        if(score >= 0 && score <= 100){

            result = (score >= 90)? "A" :(score >= 80)? "B" :(score >= 70)? "C" :(score >= 60)? "D" :(score >= 50)? "E" :(score >= 40)? "F" : "Invalid score";

        }
        /*
        its good to mix if statements and ternaries, because mixing them both can make the code more readable and its also a advanced skill, so having it will be good.
         */
    }
}
