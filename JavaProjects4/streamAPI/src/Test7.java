import javax.lang.model.element.NestingKind;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test7 {

    // intermediate operations


    public static void main(String[] args) {

//        distinct();
//        limit();
//        sorted();
//        peek();
//        skip();
//        filter();
//        map();
//        flatMap1();
//        flatMap2();
        flatMap3();
        List<String> deneme = List.of("Erdem","Nayin");

    }


    public static void distinct(){
        getDuplicatedNameList().stream().distinct().forEach(System.out::println);
    }

    public static void limit(){
        Stream<Integer> stream = Stream.iterate(1, i -> i*2);
        stream.limit(15).forEach(System.out::println);
    }

    public static void sorted(){
        getDuplicatedNameList().stream().sorted().forEach(System.out::println);


        System.out.println();


        getDuplicatedNameList().stream()
                .sorted((a,b) -> Character.compare(a.charAt(a.length() - 1 ), b.charAt(b.length() - 1)))
                .forEach(System.out::println);


        System.out.println();


        Comparator<String> comparator = (a,b) -> Character.compare(a.charAt(a.length() - 1 ), b.charAt(b.length() - 1));
        getDuplicatedNameList().stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    public static void peek(){
        List<String> list = Stream.of("One","Two","Three","Four")
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("Filtered value : "  + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Mapped value : "  + s))
                .collect(Collectors.toList());

        list.forEach(System.out::println);

    }

    public static void skip(){
        IntStream intStream = IntStream.range(1, 15);
        intStream.skip(10).forEach(System.out::println);

        System.out.println("-----");

        IntStream intStream2 = IntStream.range(1, 15);
        intStream2.parallel().skip(10).forEach(System.out::println);
    }

    public static void filter(){

        Predicate<String> stringLengthPredicate = s -> (s.length() > 4);
        Predicate<String> stringFirstLetterPredicate = s -> (s.charAt(0) != 'a' & s.charAt(0) != 'A');

        List<String> list = getDuplicatedNameList().stream()
                                .distinct()
                                .filter(stringLengthPredicate)
                                .peek(s -> System.out.println("Length > 4 " + s))
                                .filter(stringFirstLetterPredicate)
                                .peek(s -> System.out.println("First letter != 'A' | 'a' " + s))
                                .map(String::toUpperCase)
                                .peek(s -> System.out.println("Mapped value is  " + s))
                                .collect(Collectors.toList());

        System.out.println();
        list.forEach(System.out::println);
    }

    public static void map(){
        Employee john = new Employee("E123", "John Nhoj", 200.99, "IT");
        Employee south = new Employee("E223", "South Htuos", 299.99, "Sales");
        Employee reet = new Employee("E133", "Reet Teer", 300.99, "IT");
        Employee prateema = new Employee("E143", "Prateema Rai", 300.99, "Benefits");
        Employee yogen = new Employee("E323", "Yogen Rai", 200.99, "Sales");

        List<Employee> employees = Arrays.asList(john, south, reet, prateema, yogen);

        List<String> list = employees.stream().map(Employee::getName)
                                .filter(s -> s.startsWith("J"))
                                .collect(Collectors.toList());

        System.out.println(list);

    }

    /* flatMap
    https://www.youtube.com/watch?v=sVX421gaRT4
    https://www.youtube.com/watch?v=CwvlS3ViGFQ
    https://howtodoinjava.com/java8/stream-flatmap-example/
    https://www.javatpoint.com/flatmap-method-in-java-8#:~:text=In%20Java%208%20Streams%2C%20the,into%20a%20single%20resultant%20stream.
    https://www.baeldung.com/java-flatten-nested-collections
    https://www.baeldung.com/java-difference-map-and-flatmap

         map = one -> one
     flatMap = one -> many
     */

    public static void flatMap1(){

        Stream.of(1,2,3,4,5,6).flatMap( i -> Stream.of(i+10, i-10))
                .forEach(System.out::println);

    }

    public static void flatMap2(){
        var array1 = new int[]{1,2,4};
        var array2 = new int[]{65,764,3,64};

        Stream.of(array1,array2).flatMapToInt(IntStream::of)
                .forEach(System.out::println);
    }

    public static void flatMap3(){

        getNestedList().stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }

    public static List<String> getDuplicatedNameList(){
        List<String> duplicatedNames = Arrays.asList("Erdem", "Ali", "Max", "Ali", "Alptuğcan", "Jack", "Erdem", "Max", "Jack", "Kenancan", "Ala");

        return duplicatedNames;
    }

    public static ArrayList<ArrayList<String>> getNestedList(){

        ArrayList<ArrayList<String>> nestedList = new ArrayList<>();

        nestedList.add(new ArrayList<String>());
        nestedList.get(0).add(0, "BMW");
        nestedList.get(0).add(1, "Mercedes");
        nestedList.get(0).add(2, "Audi");

        nestedList.add(new ArrayList<String>());
        nestedList.get(1).add(0, "Honda");
        nestedList.get(1).add(1, "Mazda");

        nestedList.add(new ArrayList<String>());
        nestedList.get(2).add(0, "Dodge");
        nestedList.get(2).add(1, "Chevrolet");
        nestedList.get(2).add(2, "Ford");
        nestedList.get(2).add(3, "Chrysler");

        return nestedList;

    }
    
}
