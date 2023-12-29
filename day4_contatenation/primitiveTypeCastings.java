package day4_contatenation;

public class primitiveTypeCastings {

    public static void main(String[] args) {

        //--------------- implicit castings -----------------

        byte a = 15;

        short b = a;
        // short b = (short)a; --> this is what happens in the background

        System.out.println(b);

        //--------------------------------------------------------------
        int c = a; //implicit casting

        //---------------------------------------------------------------
        long d = 3000L;

        float f = d; //implicit casting



        //--------------------------- explicit casting ---------------------------------

        int x = 100;

        byte y = (byte)x;

        System.out.println(y);

        //----------------------------------------------------------------

        float z = 20.8f;

        short q = (short)z; //

        System.out.println(q); //wont print the whole 20.8

        //--------------------------------------------------------------


        double n1 = 2.5;

        byte n2 = (byte) n1;

        System.out.println(n2);



    }
}
