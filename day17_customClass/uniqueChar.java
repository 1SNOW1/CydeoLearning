package day17_customClass;

public class uniqueChar {

    public static void main(String[] args) {


        String str = "aabcccd";

        String unique = ""; // "bd"

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) { //checks how many times the ch has appeared in str
                if (str.charAt(i) == ch) { //if the ch has appeared in the string
                    count++; //increase the frequency by 1
                }
            }
            if (count == 1 && !unique.contains("" + ch)) { //if the frequency is one, then its unique
                unique += ch + "" + count;
            }
        }
        System.out.println(unique);
    }
}
