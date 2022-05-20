import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test5 {

    // utility methods
    public static void main(String[] args) {

        System.out.println("\nStream.of() : ");
        Stream<String> color = Stream.of("yellow");
        color.forEach(System.out::println);

        System.out.println("\nStream.of() : ");
        Stream<String> student = Stream.of("Erdem","Nayin","180202050");
        student.forEach(System.out::println);

        System.out.println("\nStream.ofNullable : ");
        Stream<String> name = Stream.ofNullable(null);
        name.forEach(System.out::println);

        System.out.println("\nStream.empty() : ");
        Stream<Integer> empty = Stream.empty();
        empty.forEach(System.out::println);

        System.out.println("\nStream.generate() : ");
        Supplier<Integer> randomIntegerSupplier = () -> (int)(Math.random() * 10);
        Stream<Integer> integerStream = Stream.generate(randomIntegerSupplier).limit(10);
        integerStream.forEach(System.out::println);

        System.out.println("\nStream.iterate().limit() : ");
        Stream<Integer> iterate = Stream.iterate(10, i -> i +1).limit(10);
        iterate.forEach(System.out::println);

        System.out.println("\nStream.iterate() : ");
        Stream<Integer> iterate1 = Stream.iterate(0, i -> i < 10, i -> i + 1);
        iterate1.forEach(System.out::println);

        System.out.println("\nStream.concat() : ");
        Stream<String> numbers1 = Stream.of("1","2","3");
        Stream<String> numbers2 = Stream.of("9","8","7");
        Stream<String> finalStream = Stream.concat(numbers1,numbers2);
        finalStream.forEach(System.out::println);

        System.out.println("\nIntStream and LongStream .range() : ");
        IntStream intStream = IntStream.range(10,18);
        intStream.forEach(System.out::println);

        System.out.println("\nIntStream and LongStream .rangeClosed() : ");
        IntStream intStream1 = IntStream.rangeClosed(10,18);
        intStream1.forEach(System.out::println);


    }
}
