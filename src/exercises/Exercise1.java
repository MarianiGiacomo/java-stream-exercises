package exercises;

import java.util.stream.IntStream;

public class Exercise1 implements Runnable {

  @Override
  public void run() {
    System.out.println("Exercise 1");
    IntStream.range(0, 5).average().ifPresent(System.out::println);
  }

}
