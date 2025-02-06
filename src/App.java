
import exercises.Exercise1;
import exercises.Exercise2;

public class App {
    public static void main(String[] args) throws Exception {
        Exercise1 e1 = new Exercise1();
        System.out.print("Exercise 1: ");
        e1.run();

        Exercise2 e2 = new Exercise2();
        System.out.print("Exercise 2: ");
        e2.run();
    }
}
