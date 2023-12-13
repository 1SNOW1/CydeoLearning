package day16_nestedLoop;

public class frequencyOfAChar {

    public static void main(String[] args) {

        String str = "aaabbbbbcccccccc";
        char c = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            if (str.charAt(i) == c){
                count++;
            }

        }

        System.out.println(count);
    }
}
