package day33_abstraction.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String gender, String jobTitle, int id, double salary, String programmingLanguage) {
        super(name, gender, jobTitle, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getName() + " develops in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", programming language=" + programmingLanguage + "}";

    }
}
