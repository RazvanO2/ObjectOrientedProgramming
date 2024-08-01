package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Gigel", 70);
        students[1] = new Student("Dorel", 60);
        students[2] = new Student("Marcel", 88);
        students[3] = new Student("Ionel", 40);

        Internship[] internships = new Internship[4];
        internships[0] = new Internship("Google", "41", students);
        internships[1] = new Internship("Amazon", "60", students);
        internships[2] = new Internship("Facebook", "66", students);
        internships[3] = new Internship("Microsoft", "80", students);

        internships[0].chooseCandidateForInterview();

        // Opțional, în loc de arrays pentru campul students puteți să folosiți și obiecte de tip List, e.g. ArrayList (exemplu)
         ArrayList<Student> listOfStudents = new ArrayList();
        // interesant, ca nu trebuie sa mai declari o marime, este dinamic alocat; imi aduce aminte putin de stacks;
        for (int i = 0; i<students.length; i++) {
            listOfStudents.add(students[i]);
        }// poate fi rescris sub forma de Collection.addAll()

        System.out.println(listOfStudents.get(0).name);


        // Task 3
        Student student_1 = new Student("Razvan", 99);
        Student student_2 = new Student("Razvan", 99);
        if (student_1.equals(student_2)) {
            System.out.println("Students are the same");
        }
        else{
            System.out.println("Students are not the same");
        }
        student_2 = student_1;
        // aici trebuie sa fie egal;
        if (student_2.equals(student_1)) {
            System.out.println("Students are the same");
        }
        /* Cel mai probabil, cele 2 obiecte nu sunt egale deoarece se compara referintele dintre cele 2, stiu ca in Swift aveam acelasi comportament.  */
    }
}
