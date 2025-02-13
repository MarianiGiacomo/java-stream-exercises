
import java.util.stream.Stream;

import exercises.Exercise1;
import exercises.Exercise2;
import exercises.Exercise3;

public class App {
    public static void main(String[] args) throws Exception {
        Stream.of(new Exercise1(), new Exercise2(), new Exercise3())
                .forEach(Runnable::run);
    }
}
