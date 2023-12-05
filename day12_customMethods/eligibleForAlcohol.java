package day12_customMethods;

public class eligibleForAlcohol {
    public static void main(String[] args) {

        eligibleForAlcohol(19);

    }

    public static void eligibleForAlcohol(int age){

        if(age >= 18){
            System.out.println("You have permission to buy alcohol");
        }else {
            System.out.println("You are not 18 thus can not drink alcohol");
        }
    }
}
