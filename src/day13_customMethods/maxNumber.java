package day13_customMethods;

public class maxNumber {

    public static void main(String[] args) {
        
       int checkMaxNumber = max(10,20);
        System.out.println("checkMaxNumber = " + checkMaxNumber);
        

    }

    public static int max(int n1, int n2) {
        return n1 > n2? n1 :n2; //could be replaced by "Math.max()"
    }
}
