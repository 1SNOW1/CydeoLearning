package day13_customMethods;

public class oddChecker {

    public static void main(String[] args) {

        int numberToCheck = 10 ;
        boolean isOddResult = isOdd(numberToCheck);
        System.out.println(numberToCheck + " is odd: " + isOddResult);
    }

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

}
