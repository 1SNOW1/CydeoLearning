package day33_abstraction.employeeTask;

public class Tester extends Employee{
    public Tester(String name, String gender, String jobTitle, String id, double salary) {
        super(name, gender, jobTitle, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() +" is testing the application");
    }


}
