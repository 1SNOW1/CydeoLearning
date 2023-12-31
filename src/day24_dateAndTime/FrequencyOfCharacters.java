package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        //I declare a String var
        String str = "aaaaabbbcccccc";

        //I declare an empty bag where the result will be put into
        String result = "";

        //I make a loop in which the str is first converted into an array
        for (String each : str.split("")) {

            //here I am converting the str.split("") which is an array,
            // into a dataStructure since it is required to use Collections frequency method
            //then im assigning it to a int var called frequency, int because frequency will return a number
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            //here im saying if the result (empty bag) does not contain the letter its iterating through then add it to the
            //empty bag and add the frequency next to it
            if (!result.contains(each)) {
                result += each + frequency;
            }
        }
        //last but not least im printing the result
        System.out.println(result);


    }
}
