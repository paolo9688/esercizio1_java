/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
*/

package ArrayList;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Charlie", 21));
        studentList.add(new Student("David", 23));

        System.out.println("Lista degli studenti:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        studentList.add(new Student("Eve", 19));
        studentList.add(new Student("Frank", 24));
        studentList.add(new Student("Grace", 20));
        studentList.add(new Student("Henry", 22));

        System.out.println("\nLista degli studenti aggiornata:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}