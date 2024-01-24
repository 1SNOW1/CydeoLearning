package day29_inheritance.tasks;

public class Student {

    private String name, schoolName;
    private int age;
    private char gender, grade;


    public Student(String name, String schoolName, int age, char gender, char grade) {
        setName(name);
        setSchoolName(schoolName);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isBlank() || name.isEmpty()){
            System.err.println("Name cannot be blank or empty");
            System.exit(1 );
        }
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName.isEmpty() || schoolName.isBlank()){
            System.err.println("School name cannot be empty or blank");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90){
            System.err.println("We dont have student below the age of 5 and above the age of 90");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F')){
            System.err.println("Anything but M (Male) or F (Female) is not accepted");
            System.exit(1);
        }

        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if ( !(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.err.println("Grades other than A,B,C,D,F is not accepted");
            System.exit(1);
        }

        this.grade = grade;
    }
}
