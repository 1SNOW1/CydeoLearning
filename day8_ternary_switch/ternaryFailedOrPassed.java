package day8_ternary_switch;

public class ternaryFailedOrPassed {

    public static void main(String[] args) {

        int score = 50;

        String result = "";

        result = (score >= 50) ? "passed" : "failed";

        System.out.println(result);
    }
}
