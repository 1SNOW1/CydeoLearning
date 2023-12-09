package day14_forLoop;

public class methodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println(sumOfNumbers(1,2));
        System.out.println(sumOfNumbers(1,2,3));
        System.out.println(sumOfNumbers(1,2,3,4));


    }

    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
    public static double sumOfNumbers(double num1, double num2){
        return num1 + num2;
    }
    public static
}
