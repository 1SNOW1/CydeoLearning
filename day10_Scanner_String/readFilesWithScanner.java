package day10_Scanner_String;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class readFilesWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_Scanner_String/test.txt"));

        System.out.println( scan.nextLine() );
        System.out.println( scan.nextLine() );
        System.out.println( scan.nextLine() );





        // System.out.println( scan.hasNext() );
        scan.close();



    }
}
