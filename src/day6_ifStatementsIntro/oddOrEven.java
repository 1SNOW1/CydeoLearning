package day6_ifStatementsIntro;

public class oddOrEven {

    public static void main(String[] args) {

        int number = 75;

        boolean isEven = number % 2 == 0; //when we divide a number by 2, if the remainder is 0, it means the number is even

        //boolean isOdd = number % 2 != 0; //when we divide a number by 2, if the remainder is not 0, it means the number is odd

        //below is another way to see whether the number is odd or not

        boolean isOdd = !isEven;

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);

    }
}
