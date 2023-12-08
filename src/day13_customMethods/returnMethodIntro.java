package day13_customMethods;

public class returnMethodIntro {

    public static void main(String[] args) {

       int total = addition(10,20);

        System.out.println(total);

//------------------------------------------------------

        double total1 = square(50);
        System.out.println(total1);

//------------------------------------------------------

        int r = cube(6);

        System.out.println(r);


    }



    public static int addition(int n1,int n2){

        int result = n1 + n2;
        return result;
    }


    public static int square(int sqrt1){

        int sqrtTotal = sqrt1*sqrt1;

        return sqrtTotal;

    }


    public static int cube(int num){
        int cube = addition(num,num) * num;
        return cube;
    }
}
