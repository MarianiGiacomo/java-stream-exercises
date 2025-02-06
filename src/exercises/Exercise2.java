package exercises;

import java.util.List;

import classes.Item;

public class Exercise2 implements Runnable {

  @Override
  public void run() {
    List<Item> items = List.of(
        new Item(1, "Screw"),
        new Item(2, "Nail"),
        new Item(3, "Bolt"));
    items.stream().map(i -> i.getName()).sorted().forEach(System.out::print);
    // items.stream().sorted((a, b) ->
    // a.getName().compareTo(b.getName())).forEach(System.out::print);
  }
}
