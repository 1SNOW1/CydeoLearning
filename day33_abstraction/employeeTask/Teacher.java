package day33_abstraction.employeeTask;

public class Teacher extends Employee {
    /*
    the compile error that occurs when you extend an abstract class can be solved by
    making the subclass into an abstract class, but this will prevent you from going into detail within this class
    (which is the reason why the abstract concept in OOP languages are for), so to solve this you need to
    override the methods in the abstract within the subclasses.
     */

    public Teacher(String name, String gender, String jobTitle, int id, double salary) {
        super(name, gender, jobTitle, id, salary);
    }

    public void work(){
        System.out.println(getName() +  " works as a teacher");
    }

}
