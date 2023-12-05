package day12_customMethods;

public class customMethodsWithParameters {

    public static void main(String[] args) {


        oddOrEven(1);

        System.out.println("-----------------------------------");


        eligibleForAlcohol(17);

        grade(89);






    }


    public static void oddOrEven(int number){

        if(number % 2 == 0) {
            System.out.println("number is even = " + number);
        } else if (number % 2 != 0) {
            System.out.println("number is odd = " + number);
        } else {
            System.out.println("zero");
        }
    }


    public static void eligibleForAlcohol(int age){

        if(age >= 18){
            System.out.println("You have permission to buy alcohol");
        }else {
            System.out.println("You are not 18 thus can not drink alcohol");
        }
    }


    public static void grade(int number){

        String grade = (number >=90)? "A" :(number >=80)? "B" :(number >= 70)? "C" :(number >=60)? "D" : "E";

        System.out.println("grade = " + grade);
    }
}
