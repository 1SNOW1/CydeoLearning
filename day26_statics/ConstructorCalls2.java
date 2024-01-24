package day26_statics;

public class ConstructorCalls2 {

    //first constructor
    public ConstructorCalls2(){
        System.out.println("Default");

    }
//----------------------------------------------------------
    //second constructor
    public ConstructorCalls2(int a){
        this(); //calls the first constructor
        System.out.println("int argument");

    }
//_-----------------------------------------------------------
    //third constructor
    public ConstructorCalls2(double b){
        this(10); //calls the second constructor
        System.out.println("double argument");

    }
//-------------------------------------------------------------
    //fourth constructor
    public ConstructorCalls2(String c){
        this(2.0); //calls the third Constructor
        System.out.println("String argument");

    }
//-------------------------------------------------------------

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("------------------------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);

        System.out.println("-------------------------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2(2.0);

        System.out.println("-------------------------------------------------");

        ConstructorCalls2 obj4 = new ConstructorCalls2("Java");




    }

}
