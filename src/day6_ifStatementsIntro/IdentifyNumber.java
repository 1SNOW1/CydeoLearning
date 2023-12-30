package day6_ifStatementsIntro;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 20;

        boolean isPositive = number > 0;
        boolean isZero = number == 0;
        boolean isNegative = number < 0;

        // could've said "boolean isNegative = !isPositive;" to prove my point as well

        System.out.println(number + " is a positive number: " + isPositive);
        System.out.println(number + " is equal to zero: " + isZero);
        System.out.println(number + " is a negative number: " + isNegative);

    }
}
