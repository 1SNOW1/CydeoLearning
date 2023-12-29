package day16_nestedLoop;

public class frequencyOfWord {

    public static void main(String[] args) {

        String str = "Java java java tell me what java is";
        String word = "Java";

        str = str.toLowerCase();
        word = word.toLowerCase();
        int count = 0;

        while (str.contains(word)) {
            count++;
            str = str.replaceFirst(word, "");

        }

        System.out.println(count);
    }
}