package day13_customMethods;

public class minNumber {

    public static void main(String[] args) {
        
        int minNumberChecker = min(10,20);
        System.out.println("minNumberChecker = " + minNumberChecker);
        
    }

    public static int min(int n1, int n2) {
        return n1 < n2? n1 :n2; //could be replaced by "Math.min()"
    }
}
