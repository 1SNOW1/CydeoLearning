package day37_exceptions;

import java.rmi.ServerError;

public class Pizza {

    //variables declared
    private char size;
    private  int numberOfCheeseTopping, numberOfPepperoniTopping;

    //constructor
    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    //getters and setters
    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    //additional methods
    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid size: " +size);

        }

        return totalPrice;
    }

    //toString method

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Cost=" + calcCost() +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)){
            System.err.println("Invalid object: "+obj);
            System.exit(1);
        }

        Pizza pizza = (Pizza) obj;
        //the obj can be referred to Pizza class everytime it needs to be casted although that would make the code less readable
        //instead giving it a reference variable that does the casting is better. As we do here
        if (size == pizza.size){
            if (numberOfPepperoniTopping == pizza.numberOfPepperoniTopping){
                return true;
            }
        }
        return false;
    }
}
