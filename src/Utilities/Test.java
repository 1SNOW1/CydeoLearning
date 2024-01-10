package Utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

/*as you can see here in order to use instance variables as well as instance methods,
 you need to create an object
 */
        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();


        System.out.println("-----------------------------------------------------");


        System.out.println(AccessModifiers.publicDate);
    }

}
