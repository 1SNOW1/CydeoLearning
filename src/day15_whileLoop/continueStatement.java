package day15_whileLoop;

public class continueStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            if (i == 4) { //this loop will skip the number 4 now
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------------");


        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0) { //if i is even
                continue; // skips the current iteration
            }
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {

            if (i == 'B' || i == 'E'){
                continue;
            }
            System.out.println(i);

        }

        System.out.println("-----------------------------------------");


        for (int i = 0; i < 10 ; i++) { //you can create a loop without curly brackets, but it will only accept the following row as a part of the loop and not anything else
            System.out.println("Hello world");
            System.out.println("Hello cydeo");
        }

        System.out.println("-----------------------------------------");


        for (int i = 50; i <= 100 ; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println();

        for (int i = 50; i <= 100 ; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 50; i <= 100 ; i++) {
            if (i % 2 != 0){
                continue;
        }
            System.out.print(i + " ");
        }
    }
}
