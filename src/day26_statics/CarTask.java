package day26_statics;

public class CarTask {

    public CarTask(){
        System.out.println("Kia");
    }

    public CarTask(String model){
        this();
        System.out.println("soul");
    }

    public CarTask(int year){
        this("model");
        System.out.println(2023);
    }

    public CarTask(double price){
        this(2023);
        System.out.println(500000.00 + "SEK");
    }

    public CarTask(String s1, String s2){
        this(1.0);
    }

    public static void main(String[] args) {
        CarTask Kia = new CarTask("Kia", "Soul");
    }

}
