package day18_garbageCollection;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null;
        System.out.println(s1);
    }
}
// if something is assigned as null its eligible for JVM garbage collection and thus no instances of it can be accessed, because the object does not exist.