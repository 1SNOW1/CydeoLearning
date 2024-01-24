package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {


    private final String id;

    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth); //needs to be the first statement within a constructor will give compile error otherwise
        if (getAge() < 18){
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        if (batchName.equalsIgnoreCase("Zero to hero") || batchName.equalsIgnoreCase("Alumni dev")){
            this.batchName = batchName;
        }else{
            System.err.println("Invalid batch name: " +batchName + "\n A batch with that name does not exist in Cydeo");
            System.exit(1);
        }
        setBatchNumber(batchNumber);
    }

    static{
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {

        if (batchNumber <= 0){
            System.err.println("Batch number cannot be less than or equal to 0");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating "+ programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+ " is eating "+ programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " does not need to sleep");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id=" + id + '\'' +
                ", batchName=" + getBatchName() +
                ", batchNumber=" + getBatchNumber() +
                '}';
    }
}

