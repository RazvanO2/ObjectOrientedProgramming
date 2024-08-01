package task2;

import java.util.Random;

public class Internship {
    String name;
    String minGrade;
    Student[] students = new Student[4];

    Internship(String name,String minGrade, Student[] students) {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }

    // metoda chooseCandidateRandomly
    // returneaza un obiect student, la intamplare, aceasta metoda nu verifica daca exista sau nu acel student.
    public Student chooseCandidateRandomly(){
        Random random = new Random();
        int index = random.nextInt(students.length);
        return students[index];
    }

    // metoda chooseCandidatesForInterview
    public void chooseCandidateForInterview(){
        for (int i = 0; i < students.length; i++){
            if (students[i].grade >= Float.parseFloat(minGrade)){
                System.out.println("Candidate " + students[i].name + " got a phone interview at " + name);
            }
        }
    }
}
