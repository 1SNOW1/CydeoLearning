package day18_garbageCollection;

public class TestBankAccountObject {

    public static void main(String[] args) {


        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Enes", 123456789);

        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        System.out.println(obj1);

        obj1.withdraw(200);

        System.out.println(obj1);

        obj1.deposit(-900);

        obj1.checkBalance();
    }
}
