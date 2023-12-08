package day13_customMethods;

public class returnStatement {

    public static void main(String[] args) {

        eligible(25);
        System.out.println("-----------------------------");

        System.out.println("Test1 started");

        boolean exit = true;
        if(exit){
            return; //main method gets terminated
        }

        System.out.println("Test1 completed");

        System.out.println("Test2 started");

    }


    public static void eligible(int age){

        if(age < 0 || age > 150){
            System.err.println("Invalid age: "+age);
            return; //exits the method
            //if the age is invalid, then this method gets terminated
        }

    }

}
