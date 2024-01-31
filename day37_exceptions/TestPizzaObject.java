package day37_exceptions;

import day36_polymorphism.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 3);
        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2);
        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('S', 4,3); // upcasting
        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total = ((Pizza)obj).calcCost(); //down-casting

        System.out.println(total+"$");

        /*double area = ((Circle) obj).area();

        this code ain't giving no error right now,
         but it will throw an exception since the two classes are not related in any way

         System.out.println(area);
         */





    }
}
