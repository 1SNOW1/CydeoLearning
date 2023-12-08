package day13_customMethods;

import java.util.Scanner;

public class customMethods3 {

    public static void main(String[] args) {

        //calculate(200,5,'/');

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers and a operator: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        char operator = input.next().charAt(0);

        calculate(n1,n2,operator);
    }


    public static void calculate(double num1, double num2, char mathOperator){


        switch (mathOperator){

            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " " + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " "+ num2 + " " + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 +" " + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " " + " = " + (num1 / num2));
                break;

            default:
                System.err.println("Invalid operator: "+mathOperator);
        }

    }

}
