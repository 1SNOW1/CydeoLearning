package day15_whileLoop;

public class removeDuplicates {

    public static void main(String[] args) {

        String str = "aaabbbccc";

        String result = ""; //"abc"


        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            char each = str.charAt(i); // each character of the String str

            if (!result.contains("" + each)) { //if the String result does not contain the character of string str yet
                result += each; //then we will add the character to String result
            }
        }

        System.out.println(result);
    }
}
