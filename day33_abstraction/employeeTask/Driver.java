package day33_abstraction.employeeTask;

public class Driver extends Employee{

    public Driver(String name, String gender, String jobTitle, String id, double salary) {
        super(name, gender, jobTitle, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() +" is driving");
    }

}
