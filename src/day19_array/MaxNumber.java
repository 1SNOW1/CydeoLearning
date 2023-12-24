package day19_array;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        //I make an assumption that the first number is the greatest
        int max = numbers[0];

        //I compare whether it's the greatest, if it is then it stays greatest if it isn't it gets replaced by the greater number
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] > max){
               max = numbers[i];

           }
        }

        //I print the value and check if it works
        System.out.println("max = " + max);
    }
}
