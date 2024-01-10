package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', 16);
        Student student2 = new Student("Emre", 22, 'M', 17);
        Student student3 = new Student("Enes", 23, 'M', 18);
        Student student4 = new Student("Emirhan", 24, 'M', 19);
        Student student5 = new Student("Adolf", 25, 'M', 20);

        Student[] students = {student1, student2, student3, student4, student5};

        //here im creating the student group and im assigning its name and groupId
        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);

        group1.addStudent(students);

        System.out.println(group1);

        //lets say i want to add a student to the group
        group1.addStudent("Ensar", 18, 'M', 21);
        //now by adding the student the number of students will be 6 instead of 5
        System.out.println(group1);

        //lets say i want to remove a student
        group1.removeStudent(21);
        /*here im removing the student with the student id = 21,
        if I try to remove it by an id that does not exist then the code will not end up in an error,
        instead it will run the code anyway.
        You will end up having the same number of students.
         */
        System.out.println(group1);

        /*
        I can add the students one by one as shown below or,
        I can add the all at once by adding them through an array as shown above

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
         */

        for (Student student : group1.students) {
            System.out.println(student.name + " : " + student.id);
        }




    }
}
