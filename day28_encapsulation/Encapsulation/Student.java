package day28_encapsulation.Encapsulation;

public class Student {


    private String name;

    public String getName() {

        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false, hasSpecialChar = false;

        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)){
                hasDigit = true;
            }
        }
        if (hasDigit)
            System.err.println("Invalid name: " + name);


        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int age; //this instance variable can only be accessed within this class (Student)


    public int getAge() { //Read only

        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age) { //Write only
        if (age < 1 || age > 100) {
            System.err.println(16 + " is not a valid age to enter");
            //return; //exiting the method
            System.exit(1); //program gets terminated
        }
        this.age = age;
        System.out.println("Age of the student: " + age);
    }


}
