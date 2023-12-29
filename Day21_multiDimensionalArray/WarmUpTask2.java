package Day21_multiDimensionalArray;

import java.sql.SQLOutput;
import java.util.Arrays;

public class WarmUpTask2 {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        String[] str3 = str1.split("");
        String[] str4 = str2.split("");

        System.out.println(Arrays.toString(str3));
        System.out.println(Arrays.toString(str4));

        Arrays.sort(str3);
        Arrays.sort(str4);

        System.out.println(Arrays.toString(str3));
        System.out.println(Arrays.toString(str4));
        System.out.println(Arrays.equals(str3,str4));


        System.out.println("----------------------------------------------");



        String str5 = "java";
        String str6 = "python";

        String[] str_5 = str5.split("");
        String[] str_6 = str6.split("");

        Arrays.sort(str_5);
        Arrays.sort(str_6);

        System.out.println(Arrays.equals(str_5,str_6));

    }
}
