package day26_statics.studentTask;

import java.util.ArrayList;

public class StudentsGroup {


    public String name;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    //this is the constructor to call on the instance
    public StudentsGroup(String name, int groupId) {
        this.name = name;
        this.groupId = groupId;
        students = new ArrayList<>();

    }

    //here im creating a method to add students into the arrayList of students
    public void addStudent(Student student) {
        students.add(student);
    }

    //another way of adding students to the arraylist of students
    public void addStudent(String name, int age, char gender, int id) {
        Student student = new Student(name, age, gender, id);
        students.add(student);
    } // takes name, age, gender, id of student info, creates student object using the given info, then adds the student object to the arrayList

    //now we shall be able to remove students by creating a removeStudent method
    public void removeStudent(int id){
        students.removeIf( p -> p.id == id );
    } //this method takes the student id and then removes the student object with the specified id from the arraylist of students

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "name='" + name + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
