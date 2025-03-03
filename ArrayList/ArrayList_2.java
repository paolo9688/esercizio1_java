package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_2 {

    // NOTA BENE: la classe Student è già definita nel file ArrayList_1.java appartenente allo stesso package di questo gruppo di esercizi

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));
        students.add(new Student("David", 19));
        students.add(new Student("Eve", 23));
        students.add(new Student("Frank", 20));
        students.add(new Student("Grace", 22));
        students.add(new Student("Henry", 21));
        students.add(new Student("Ivy", 19));
        students.add(new Student("Jack", 23));
        students.add(new Student("Kelly", 20));
        students.add(new Student("Liam", 22));

        // Stampa l'ArrayList originale
        System.out.println("ArrayList originale:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Ordina l'ArrayList per età
        Collections.sort(students, Comparator.comparingInt(Student::getAge));

        // Stampa l'ArrayList ordinato
        System.out.println("\nArrayList ordinato per età:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Ordina l'ArrayList per nome
        Collections.sort(students, Comparator.comparing(Student::getName));

        // Stampa l'ArrayList ordinato per nome
        System.out.println("\nArrayList ordinato per nome:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
