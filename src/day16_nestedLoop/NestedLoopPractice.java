package day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        String str = "aaaabbcccccddeeeeeeff";

        String result = ""; //"bdf"

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) { //responsible for comparing ch to each character and return the frequency of ch
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (count == 2 && !result.contains("" + ch)) { //checks which characters have appeared twice and adds it to result1htrjyhmjytjy
                result += ch;
            }
        }

        System.out.println(result);
    }
}
