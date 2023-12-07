package day13_customMethods;

public class customMethods3 {

    public static void main(String[] args) {

        calculate(200,5,'/');

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
