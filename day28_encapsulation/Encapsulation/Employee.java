package day28_encapsulation.Encapsulation;

public class Employee {

    private String name;
    private int age;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 16){
            System.err.println("Age can not be less than 16 for an employee");
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.out.println("Job title can not be empty or blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getName() {
        if (name == null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public double getSalary() { //READ
        return salary;
    }

    public void setSalary(double salary) { // WRITE

        if (salary < 0){
            System.err.println("Salary can not be negative: " + salary + "$");
            System.exit(1);
        }

        this.salary = salary;
    }
}
