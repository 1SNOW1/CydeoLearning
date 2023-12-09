package day14_forLoop;

public class warmUpTask2 {

    public static void main(String[] args) {


        System.out.println(sumOf2Numbers1(10,11));
        System.out.println(sumOf3Numbers(10,11,12));
        System.out.println(sumOf4Numbers(10,11,12,13));


        }


    public static int sumOf2Numbers1(int n1, int n2){
        return n1 + n2;
    }
    public static int sumOf3Numbers(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public static int sumOf4Numbers(int n1, int n2, int n3, int n4){
        return n1 + n2 + n3 + n4;
    }

}
