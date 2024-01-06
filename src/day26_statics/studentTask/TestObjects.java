package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', 16);
        Student student2 = new Student("Emre", 22, 'M', 17);
        Student student3 = new Student("Enes", 23, 'M', 18);
        Student student4 = new Student("Emirhan", 24, 'M', 19);
        Student student5 = new Student("Adolf", 25, 'M', 20);

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);

        System.out.println(group1);
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        System.out.println(group1);



    }
}
