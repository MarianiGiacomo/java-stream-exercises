
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exercises.Exercise1;
import exercises.Exercise2;
import exercises.Exercise3;
import exercises.Exercise4;

public class App {
    public static void main(String[] args) throws Exception {
        List<Runnable> exercises = new ArrayList<>(
                Arrays.asList(
                        new Exercise1(),
                        new Exercise2(),
                        new Exercise3(),
                        new Exercise4()));
        exercises
                .stream()
                .forEach(Runnable::run);
    }
}
