package day12_customMethods;

import javax.xml.validation.ValidatorHandler;

public class customMethodsPractice {

    public static void main(String[] args) {

        maxNum(100, 100);


        System.out.println("--------------------");


        initial("Enes", "Orhan");
    }


    public static void maxNum(double num1, double num2){

        if(num1 > num2){
            System.out.println("Biggest number is " + num1);
        }else if(num2 > num1){
            System.out.println("Biggest number is " + num2);
        }else {
            System.out.println("Equal");
        }


    }

//create a method that can display the initials of a person (firstname, lastname)

    public static void initial(String firstName, String lastName ){

        String initial = firstName.charAt(0) + "," + lastName.charAt(0);

        System.out.println("Initial is: " + initial);

    }

}
