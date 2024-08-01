package task2;

public class Student {
    String name;
    double grade;
    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
// task 4, nu o sa modific codul din main pentru ca o sa am probleme;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
