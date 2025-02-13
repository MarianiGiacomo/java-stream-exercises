package exercises;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise3 implements Runnable {

  @Override
  public void run() {
    System.out.println("Exercise 3");
    Stream.of(Arrays.asList("a", "b"), Arrays.asList("a", "c"))
        .filter(l -> l.contains("c"))
        .flatMap(l -> l.stream())
        .forEach(System.out::println);

  }
}
