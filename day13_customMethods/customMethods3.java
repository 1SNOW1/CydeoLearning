package day13_customMethods;

public class customMethods3 {

    public static void main(String[] args) {


    }


    public static void calculate(double num1, double num2, double result, char mathOperator){




        switch (mathOperator){

            case '+': result = num1 + num2;
                System.out.println(num1 +" "+mathOperator+" "+num2+" "+ " = "+ result);
            case '-': result = num1 - num2;
                System.out.println(num1 +" "+mathOperator+" "+num2+" "+ " = "+ result);
            case '*': result = num1 * num2;
                System.out.println(num1 +" "+mathOperator+" "+num2+" "+ " = "+ result);
            case '/': result = num1 / num2;
                System.out.println(num1 +" "+mathOperator+" "+num2+" "+ " = "+ result);

            default:
        }

    }

}
