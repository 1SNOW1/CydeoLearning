package day38_exceptions;

class CustomCheckedException extends Exception {

}

class CustomUncheckedException extends RuntimeException {

}

public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------------");


        throw new CustomUncheckedException();


    }
}
