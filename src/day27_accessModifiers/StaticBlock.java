package day27_accessModifiers;

public class StaticBlock {


    public StaticBlock() {
        System.out.println("Constructor");
    }


    public static void main(String[] args) { // prio 2

        System.out.println("Main method");

        new StaticBlock(); //prio 3
        new StaticBlock();
        new StaticBlock();

    }

    static { //prio 1
        System.out.println("Static block");
    }
}
