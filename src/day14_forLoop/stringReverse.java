package day14_forLoop;

public class stringReverse {

    public static void main(String[] args) {

        String name = "mamma pappa dotter son";
        System.out.println(reverse(name));

    }

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
