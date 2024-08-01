package task1.Lab1;

/**
 * Task 1 (3p)
 *
 * Creați pachetul lab1, unde adăugați codul din secțiunea Exemplu de implementare. Rulați codul din IDE.
 * Folosind linia de comandă, compilați și rulați codul din exemplu
 * Mutați codul într-un pachet task1, creat în pachetul lab1. Folosiți-vă de IDE, de exemplu Refactor → Move pentru IntelliJ. Observați ce s-a schimbat în fiecare fișier mutat.
 */
public class Lab1 {
    int dogs;
    int cats;

    public int getAnimalsCount() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + getAnimalsCount());
    }
}
