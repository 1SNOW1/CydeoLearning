package day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {
/*
        Employee employee = new Employee("Daniel", "male", "Developer", 123, 100000);
        as you can see, the employee class cannot be instantiated, because it's an abstract class
 */

        Teacher teacher1 = new Teacher("James", "Male","Maths Teacher", 123, 50000);

        System.out.println(teacher1);

        Developer javaDeveloper = new Developer("Enes", "Male", "Java Developer", 2002, 1000000, "Java");

        System.out.println(javaDeveloper);

        javaDeveloper.work();

        teacher1.work();
    }
}
