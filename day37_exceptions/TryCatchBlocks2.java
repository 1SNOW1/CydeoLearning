package day37_exceptions;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("program1 started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            //e.printStackTrace();//displays full details of the exception after the execution of program
            System.out.println(e.getMessage());

        }
        System.out.println("program 1 ended");

        System.out.println("----------------------------------------------------");

        System.out.println("program 2 started ");


        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("program 2 ended");
    }
}
