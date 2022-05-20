import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

//order encountered and stream.unordered()
public class Test4 {
    public static void main(String[] args) {

        ArrayList<String> names = Test1.namesFactory();
        System.out.println("ArrayList :");
        names.forEach(System.out::println);



        Stream<String> stringStream = names.stream();

        System.out.println("\nStream :");
        stringStream.forEach(System.out::println);



        Stream<String> unorderedStringStream = names.stream().unordered();
        System.out.println("\nunorderedStream :");
        unorderedStringStream.forEach(System.out::println);


        Set<Integer> integerSet = Set.of(1,2,3,4,5,6,7);
        Stream<Integer> setStream = integerSet.stream().unordered();
        System.out.println("\nunorderedSetStream :");
        setStream.forEach(System.out::println);
    }
}
