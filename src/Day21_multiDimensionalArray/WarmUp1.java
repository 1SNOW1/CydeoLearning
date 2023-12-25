package Day21_multiDimensionalArray;

import java.util.Arrays;

public class WarmUp1 {

    public static void main(String[] args) {

        String str1 = "   Hello World                   I    love        Java";

        String[] sentence = str1.split(" ");

        str1 = "";

        /*
        here im checking every "each" in the array, if its empty (not blank)
        then it will continue and once it comes by a word it will add the word + a space in str1
         */
        for (String each : sentence) {
            if (!each.isEmpty()) {
                str1 += each + " ";

            }
        }
        str1 = str1.trim(); //we added for each word an extra space after it in the loop and now we are removing the extra space at the end, since its not needed there
        System.out.println(str1);

    }
}
