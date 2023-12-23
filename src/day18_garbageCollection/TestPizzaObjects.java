package day18_garbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        pizza1.size = 'l';

        Pizza pizza2 = new Pizza();

        pizza2.size = 'm';


        pizza2.setInfo('s', 5, 5);
        pizza1.setInfo('l', 2, 2);
        System.out.println(pizza2);
        System.out.println(pizza1);
//-----------------------------------------------------------

        //lets say you want to buy 60 pizzas and want to know how much it costs

        double totalCost = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('s', 2, 2);
            totalCost += small.calcCost();


            Pizza medium = new Pizza();
            medium.setInfo('m', 3, 3);
            totalCost += medium.calcCost();


            Pizza large = new Pizza();
            large.setInfo('l', 4, 4);
            totalCost += large.calcCost();

        }


        System.out.println(totalCost+"$");
    }


}
