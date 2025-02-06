package exercises;

import java.util.stream.IntStream;

public class Exercise1 implements Runnable {

  @Override
  public void run() {
    IntStream.range(0, 5).average().ifPresent(System.out::println);
  }

}
