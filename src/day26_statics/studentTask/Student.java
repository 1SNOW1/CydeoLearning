package day26_statics.studentTask;

public class Student {


    public String name;
    public int age;
    public char gender;
    public int id;

    public Student(String name, int age, char gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {


    }
}
