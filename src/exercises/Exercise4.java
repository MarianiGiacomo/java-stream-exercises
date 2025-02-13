package exercises;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import classes.Person;

public class Exercise4 implements Runnable {
  @Override
  public void run() {
    System.out.println("Exercise 4");
    int sum = IntStream.of(1, 2, 3).sum();
    System.out.println(sum);
    OptionalInt max = IntStream.of(1, 2, 3).max();
    System.out.println(max.getAsInt());

    List<Person> persons = List.of(
        new Person("Alan", "Burke", 22),
        new Person("Zoe", "Peters", 20),
        new Person("Peter", "Castle", 29));
    persons.stream().max((a, b) -> Integer.compare(a.getAge(), b.getAge())).ifPresent(System.out::println);

    List<Integer> integers = List.of(10, 47, 33, 23);
    integers.stream()
        .reduce((a, b) -> {
          if (a < b) {
            return b;
          }
          return a;
        }).ifPresent(System.out::println);
    int maxInt = integers.stream()
        .reduce(0, (a, b) -> {
          if (a < b) {
            return b;
          }
          return a;
        });
    System.out.println(maxInt);
  }
}
