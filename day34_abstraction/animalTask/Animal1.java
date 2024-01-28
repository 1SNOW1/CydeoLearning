package day34_abstraction.animalTask;

public abstract class Animal1 {

    //variables declared
    private String name, breed, gender, color;
    private int age;

    //toString method
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    //constructor
    public Animal1(String name, String gender, String color, int age) {
        setName(name);
        setBreed(getClass().getSimpleName());
        setGender(gender);
        setColor(color);
        setAge(age);
    }

    //getters and setters for the variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name must be given cannot be empty or blank: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))){
            System.err.println("Male or Female only: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.err.println("Age cannot be below or equal to 0: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    //methods
    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void drink();
}
