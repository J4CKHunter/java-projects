import java.util.ArrayList;
import java.util.stream.Stream;

//introduce class

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> names = namesFactory();
        Stream<String> stream =  names.stream();

//        stream.forEach(System.out::println);

//        stream.filter(s -> s.length() > 4)
//                .forEach(System.out::println);

//        stream.distinct().filter(s -> s.length() > 4)
//                .forEach(System.out::println);

        stream.distinct().filter(s -> s.length() > 5)
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);


    }

    public static ArrayList<String> namesFactory(){

        ArrayList<String> names = new ArrayList<>();

        names.add("Erdem");
        names.add("Clementine");
        names.add("Max");
        names.add("Alptuğcan");
        names.add("Jack");
        names.add("Kenancan");
        names.add("Erdem");

        return names;
    }
}
