package day22_arraysList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); //autoboxing happening here
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1, 15);
        list.add(3, 25);
        list.add(5, 35);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));


        System.out.println("------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammed");
        studentsList.add("Adem");
        studentsList.add("Ahlam");
        studentsList.add("Olla");

        String lastStudent = studentsList.get(studentsList.size()-1);
        String firstStudent = studentsList.get(0);

        System.out.println(studentsList.size());
        System.out.println(studentsList);
        System.out.println(firstStudent);
        System.out.println(lastStudent);





    }
}
