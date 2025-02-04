import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        // Stream a list of int primitives between the range of 0 (inclusive) and 5
        // (exclusive). Calculate and
        // output the average.
        IntStream.range(0, 5).average().ifPresent(System.out::println);
    }
}
