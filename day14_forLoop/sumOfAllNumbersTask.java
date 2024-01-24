package day14_forLoop;

public class sumOfAllNumbersTask {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: "+sum);

        int sumOfEveryOther = 0;
        for (int i = 2; i <= 100 ; i += 2) {
            sumOfEveryOther += i;
        }
        System.out.println("Sum of every other number from 1 to 100: " +sumOfEveryOther);


        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");
        }
        System.out.println();



    }

}
