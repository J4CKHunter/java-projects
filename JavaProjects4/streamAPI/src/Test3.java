import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// retrive stream from sources

public class Test3 {
    public static void main(String[] args) {

//        collections();
//        arrays();
//        streamOf();
//        supplier();
//        fromRandomClass();
        bufferedReader();

    }

    public static void collections(){

        ArrayList<String> arrayList = Test1.namesFactory();

        Stream<String> streamArrayList = arrayList.stream();
        Stream<String> streamArrayList1 = arrayList.parallelStream();


        Stream<String> sequentialStream = Stream.of("Erdem", "Kerem", "Ali", "Veli");
        sequentialStream.forEach(System.out::println);

    }

    public static void arrays(){

        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i ;
        }

        DoubleStream doubleStream = Arrays.stream(array);

        DoubleStream doubleStream1 = Arrays.stream(array, 3,8);

        doubleStream1.forEach(System.out::println);

    }

    public static void streamOf(){

        Stream<String> stringStream = Stream.of("Erdem");

        Stream<String> stringStream1 = Stream.of("Erdem","Ali", "Zurna");

        IntStream intStream = IntStream.of(1,8,0,2,0,2,0,5,0);
    }

    public static void supplier(){

        Supplier<Integer> randomIntegerSupplier = () -> (int)(Math.random() * 10);

        Stream<Integer> integerStream = Stream.generate(randomIntegerSupplier).limit(10);

        integerStream.forEach(System.out::println);

    }

    public static void fromRandomClass(){

        DoubleStream doubleStream = new Random().doubles(10);
        doubleStream.forEach(System.out::println);

        System.out.println();

        IntStream intStream = new Random().ints(10,500,1000);
        intStream.forEach(System.out::println);
    }

    public static void bufferedReader(){

        String fileName = "Eppur si muove.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(fileName));
                Stream<String> fileLines = br.lines()) {

            fileLines.forEach(element -> System.out.printf("%s\n", element));
//            System.out.printf("Number of lines in the file: %d\n\n", fileLines.count());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
