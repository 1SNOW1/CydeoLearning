package day28_encapsulation.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
        //student.age = -200;

        //System.out.println(student.getAge());


        student.setAge(21);

        Student student1 = new Student();

        student1.setAge(14);
        //System.out.println(student.getAge());


        System.out.println("Test completed");


        student.setName("Enes");
        student.getName();
        System.out.println(student);











    }
}
