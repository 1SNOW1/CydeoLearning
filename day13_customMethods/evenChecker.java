package day13_customMethods;

public class evenChecker {

    public static void main(String[] args) {

        int numberToCheck = 3;
        boolean evenResult = isEven(numberToCheck);
        System.out.println(numberToCheck + " is even: " + evenResult);
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
