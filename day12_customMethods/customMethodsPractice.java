package day12_customMethods;

public class customMethodsPractice {

    public static void main(String[] args) {

        maxNum(100, 2000);

    }


    public static void maxNum(double num1, double num2){

        if(num1 > num2){
            System.out.println("Maximum number is " + num1);
        }else if(num2 > num1){
            System.out.println("Maximum number is " + num2);
        }else {
            System.out.println("Equal");
        }


    }
}
