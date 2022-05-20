import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test6 {

    // terminal operations, functions

    public static void main(String[] args) {

//        forEachAndforEachOrdered();
//        toArray();
//        reduce1();
//        reduce2();
//        reduce3();
//        reduce4();
//        collect1();
//        collect2();
//        collect3();
//        collect4();
//        collect5();
//        collect6();
//        collect7();
        otherTerminalOperations();
    }

    public static void forEachAndforEachOrdered(){

        Set set = Set.of(1,2,3,4,5);

        Stream<Integer> stream1 = set.stream();

        stream1.forEach(System.out::println);



        List list = List.of("Erdem","Jack","Myriam","Hernandez");

        Stream<String> stream2 = list.stream();

        stream2.forEachOrdered(System.out::println);

    }

    public static void toArray(){


        int[] ints = IntStream.of(1,2,3,4,5).toArray();
        for (int i : ints
        ) {
            System.out.println(i);
        }


        String[] stringArray = Test1.namesFactory().stream().toArray(String[]::new);
        for (String s: stringArray) {
            System.out.println(s);
        }





    }

    public static void reduce1(){

        BinaryOperator<Integer> operator = (i, j) -> {

            System.out.println("i : " + i + " j : " + j);
            int sum = i + j;
            System.out.println("Sum: " + sum);
            return sum;
        };

        int sum = Stream.of(1,2,3,4,5,6).reduce(0,operator);
        System.out.println("Final sum is : " + sum);

        System.out.println();

        int sum2 = Stream.of(1,2,3,5).reduce(0,Integer::sum);
        System.out.println("Final sum2 is : " + sum2);

        System.out.println();


        BinaryOperator<String> nameConcat = (s1, s2) -> s1.concat(s2).concat("-");
        String names = Test1.namesFactory().stream().reduce("",nameConcat);
        System.out.println(names);
    }

    public static void reduce2(){

        // we use this type of reduce when source's element's types and
        // generated value's types are different from each other.
        // example : you have arraylist that contains strings and you want to know
        // sum of the all string's lengths : s1.length() + s2.length() + n.length()
        // that returs an integer value.

        //the third parameter is for the situations using parallel stream

        ArrayList<String> names = Test1.namesFactory();

        BiFunction<Integer, String, Integer> function = (length, string) -> length + string.length();

        int sumNamesLengths = names.stream().reduce(0, function, Integer::sum);

        System.out.println(sumNamesLengths);


    }

    public static void reduce3(){

        Optional<Integer> optionalSum = Stream.of(1,2,3,4,5,6).reduce(Integer::sum);
//        optionalSum = Optional.ofNullable(null);
        int product = optionalSum.orElse(31);
        System.out.println(product);


        BinaryOperator<String> nameConcat = (names, name) -> names.concat("-").concat(name);
        Optional<String> optionalNames = Test1.namesFactory().stream().reduce(nameConcat);
//        optionalNames = Optional.ofNullable(null);
        String names = optionalNames.orElse("Empty");
        System.out.println(names);

    }

    public static void reduce4(){

        IntStream stream =  IntStream.of(1,2,3,4,5,6);
        OptionalInt optionalMax = stream.max();
        optionalMax.ifPresent(i -> System.out.println("max : " + i));

        stream =  IntStream.of(1,2,3,4,5,6);
        OptionalInt optionalMin = stream.min();
        optionalMin.ifPresent(i -> System.out.println("min : " + i));

        stream =  IntStream.of(1,2,3,4,5,6);
        int sum = stream.sum();
        System.out.println("sum : " + sum);

        stream =  IntStream.of(1,2,3,4,5,6);
        OptionalDouble optionalAverage = stream.average();
        optionalAverage.ifPresent(d -> System.out.println("average " + d));

        stream =  IntStream.of(1,2,3,4,5,6);
        IntStream intStream = IntStream.of(7,8,9,10,11,12);
        IntStream concatStream = IntStream.concat(stream, intStream);
        concatStream.forEach(i -> System.out.print(i + " "));
    }

    public static void collect1(){
        //https://www.journaldev.com/32457/java-stream-collect-method-examples

        //concatenating list of strings

        // List<String> -> StringBuilder

        //Let’s say you want to concatenate the list of strings to create a new string.
        // We can use Stream collect() function to perform a mutable reduction operation
        // and concatenate the list elements.


        List<String> vowels = List.of("a","e","i","o","u");

        //combiner is active on the parallel processing

        //sequential stream - nothing to combine
        StringBuilder result = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y), (a, b) -> a.append(",").append(b));
        System.out.println(result.toString());

        //parallel stream - combiner is combining partial results
        result = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y), (a,b) -> a.append("-").append(b));
        System.out.println(result.toString());


//        The supplier function is returning a new StringBuilder object in every call.
//        The accumulator function is appending the list string element to the StringBuilder instance.
//        The combiner function is merging the StringBuilder instances. The instances are merged with each other with a comma between them.

//        In the first case, we have a sequential stream of elements. So they are processed one by one and there is only one instance of StringBuilder.
//        There is no use of the combiner function. That’s why the output produced is “aeiou”.

//        In the second case, we have a parallel stream of strings. So, the elements are processed parallelly and
//        there are multiple instances of StringBuilder that are being merged by the combiner function. Hence, the output produced is “a,e,i,o,u”.

//        If the stream source is ordered such as List, the collect() method maintains the order while processing.
//        If the stream source is unordered such as Set, then the collect() method can produce different results in each invocation.


        //If you want to concatenate the list of strings, we can use the method references to reduce the code size.
        String result2 = vowels.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(result2);

    }

    public static void collect2(){
        //https://www.journaldev.com/32457/java-stream-collect-method-examples

        //Stream collect() to List using Collectors Class

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    public static void collect3(){
        //https://www.journaldev.com/32457/java-stream-collect-method-examples

        //Stream collect() to a Set

        List<Integer> numbers = List.of(1,2,3,4,5,6);

//        Set<Integer> oddNumbers = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toSet());
        Set<Integer> oddNumbers = numbers.parallelStream().filter(x -> x % 2 != 0).collect(Collectors.toSet());

        System.out.println(oddNumbers);
    }

    public static void collect4(){
        //https://www.journaldev.com/32457/java-stream-collect-method-examples

        //Stream collect() to Map

        List<Integer> numbers = List.of(1,2,3,4,5,6);
        Map<Integer, String> mapOddNumbers = numbers.parallelStream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toMap(Function.identity(),x -> numberToString(x)));
        System.out.println(mapOddNumbers);

    }

    public static void collect5(){
        //https://www.journaldev.com/32457/java-stream-collect-method-examples

        //Collectors joining() Example

        String value = Stream.of("a", "b", "c").collect(Collectors.joining());
        System.out.println(value);

        value = Stream.of("a", "b", "c").collect(Collectors.joining(","));
        System.out.println(value);

        value = Stream.of("a", "b", "c").collect(Collectors.joining(",","{", "}"));
        System.out.println(value);

        //We can use Collectors joining() methods to get a Collector that concatenates the input stream
        // CharSequence elements in the encounter order.
        // We can use this to concatenate a stream of strings, StringBuffer, or StringBuilder

        value = Stream.of("a", new StringBuilder("b"), new StringBuffer("c")).collect(Collectors.joining());
        System.out.println(value);
    }

    public static void collect6(){
//        https://dzone.com/articles/using-java-collectors

        //Summing an Integer List

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        int sum = numbers.stream().collect(Collectors.summingInt(x -> x));
        System.out.println("sum : " + sum);

        double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("avg : " + avg);

        Optional<Integer> max = numbers.stream().collect(Collectors.maxBy(Integer::compare));
        System.out.println("max : " + max.get());

        Optional<Integer> min = numbers.stream().collect(Collectors.minBy(Integer::compare));
        System.out.println("min : " + min.get());

        IntSummaryStatistics statistics = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(statistics);

        Map<Boolean,List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy(x -> x > 2));
        System.out.println("numbers : " + numbers);
        System.out.println("x > 2 -> true : " + parts.get(true));
        System.out.println("x > 2 -> false : " + parts.get(false));


    }

    public static void collect7(){
//        https://dzone.com/articles/java-stream-collectors

        Employee john = new Employee("E123", "John Nhoj", 200.99, "IT");
        Employee south = new Employee("E223", "South Htuos", 299.99, "Sales");
        Employee reet = new Employee("E133", "Reet Teer", 300.99, "IT");
        Employee prateema = new Employee("E143", "Prateema Rai", 300.99, "Benefits");
        Employee yogen = new Employee("E323", "Yogen Rai", 200.99, "Sales");

        List<Employee> employees = Arrays.asList(john, south, reet, prateema, yogen);

        Double averageSalary = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("average salary is : " + averageSalary);

        Double totalSalary = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("total salary is : " + totalSalary);

        Optional<Employee> employeeWithTheMaxSalary = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.print("employee : " + employeeWithTheMaxSalary.get().getName() + ", ");
        System.out.println("has max amount of salary is : " + employeeWithTheMaxSalary.get().getSalary());

        Double maxSalary = employees.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), emp -> emp.get().getSalary()));
        System.out.println("max salary is : " + maxSalary);

        DoubleSummaryStatistics statistics = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("statistics : " + statistics);

        List<String> employeeNames = employees.stream().collect(Collectors.mapping(Employee::getName, Collectors.toList()));
        System.out.println("all employee names in a list : "  + employeeNames);

        String allEmployees = employees.stream().map(Employee::getName).collect(Collectors.joining(",","\\","/"));
        System.out.println("all employee names in a string : " + allEmployees);

        // I fuckin' did it, I have printed it out in the same line key -> value.getName(), values.getName(), values.getName()
        Map<String, List<Employee>> deptEmps = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        deptEmps.entrySet().forEach(entry -> System.out.println("Department : " + entry.getKey() + "\nEmployees : " + entry.getValue().stream().map(Employee::getName).collect(Collectors.joining(", ")) + "\n"));

        Map<String, Long> deptEmpsCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        deptEmpsCount.entrySet().forEach(entry -> System.out.println("Department : " + entry.getKey() + " -- Count : " + entry.getValue()));

        Map<Boolean, List<Employee>> partionedEmployees = employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > averageSalary));
        partionedEmployees.entrySet().forEach(entry -> System.out.println("\nstate : " + entry.getKey() + " -- Employees : " + entry.getValue().stream().map(Employee::getName).collect(Collectors.joining(", "))));

    }

    public static void otherTerminalOperations(){

        Optional<String> min = Test1.namesFactory().stream().min(String::compareTo);
        Optional<String> max = Test1.namesFactory().stream().max(String::compareTo);
        System.out.println("min : " + min.get() + "\nmax : " + max.get() + "\n");

        String[] strings1 = { "aaaa", "aaa", "a", "aaaaa" };
        String str = Arrays.stream(strings1).min(Comparator.comparingInt(String::length)).orElseGet(String::new);
        System.out.println(str);

        String[] strings2 = {};
        str = Arrays.stream(strings2).min(Comparator.comparingInt(String::length)).orElseGet(() -> "x");
        System.out.println(str);

        double v = LongStream.range(4658,856654).average().orElse(-1);
        System.out.println(v);

        LongStream stream1 = LongStream.of(3,6,9);
        OptionalDouble average = stream1.average();
        v = average.orElseGet(()-> 1d);
        System.out.println(v);


        String[] s4 = { "one", "two", "three", "four", "five", "six", "seven" };
        boolean test;

        test = Arrays.stream(s4).noneMatch(s -> s.startsWith("z"));
        System.out.println(test);

        test = Arrays.stream(s4).noneMatch(s -> s.startsWith("f"));
        System.out.println(test);

        test = Arrays.stream(s4).anyMatch(s -> s.startsWith("z"));
        System.out.println(test);

        test = Arrays.stream(s4).anyMatch(s -> s.startsWith("f") & s.length() >= 4 );
        System.out.println(test);

        test = Arrays.stream(s4).anyMatch(s -> s.length() >= 3);
        System.out.println(test);

        test = Arrays.stream(s4).allMatch(s -> s.length() >= 3);
        System.out.println(test);

        test = Arrays.stream(s4).noneMatch( s -> false);
        System.out.println(test);

        Stream<Object> stream2 = Stream.empty();
        Optional<Object> optional1 = Optional.of(stream2.findFirst().orElseGet(Date::new));
        System.out.println(optional1.get());

        System.out.println();

        Stream<String> s6 = Stream.of("one", "two", "three", "four");
        Optional<String> optional2 = s6.findFirst();
        if(optional2.isPresent()){
            System.out.println(optional2.get());
        }

        System.out.println();

        Stream<String> s7 = Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        Optional<String> optional3 = s7.parallel().findFirst();
        if(optional3.isPresent()){
            System.out.println("parallel findfirst : " + optional3.get());
        }

        Stream<String> s8 = Stream.of("one", "two", "three", "four", "five",  "six", "seven",  "eight", "nine", "ten");
        Optional<String> opt4 = s8.parallel().findAny();
        if (opt4.isPresent()) {
            System.out.println("Parallel findAny: " + opt4.get());

        }

        System.out.println();

        Arrays.asList("red", "green", "blue").stream().sorted().findFirst().ifPresent(System.out::println);

        Arrays.asList("red", "yellow", "aaa", "blue").stream().sorted().findFirst().ifPresent(System.out::println);

    }

    public static String numberToString(int i){

        String numberString = null;

        switch (i){
            case 1 : numberString =  "one"; break;
            case 2 : numberString =  "two"; break;
            case 3 : numberString =  "three"; break;
            case 4 : numberString =  "four"; break;
            case 5 : numberString =  "five"; break;
            case 6 : numberString =  "six"; break;
            default : break;
        }
        return numberString;
    }


}
