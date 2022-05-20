import java.util.ArrayList;
import java.util.stream.Stream;

//sequential and parallel streams
public class Test2 {
    public static void main(String[] args) {

        boolean test;

        ArrayList<String> names = Test1.namesFactory();

        Stream<String> stream = names.stream();
        test = stream.isParallel();
        System.out.println("is stream parallel : " + test);

        Stream<String> parallelStream = names.parallelStream();
        test = parallelStream.isParallel();
        System.out.println("is parallelStream parallel : " + test);

        parallelStream.sequential();
        test = parallelStream.isParallel();
        System.out.println("is parallelStream parallel : " + test);


    }
}
