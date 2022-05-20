package builtininterfaces.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class JavaAPITest {
    public static void main(String[] args) {

        ArrayList<String> strings = stringsFactory();
        strings.forEach(System.out::println);


        System.out.println();


        ArrayList<String> names = namesFactory();
        Predicate<String> lengthPredicate = s -> s.length() > 5;
        names.removeIf(lengthPredicate);
        names.forEach(System.out::println);

        System.out.println();

        UnaryOperator<String> stringUnaryOperator = s -> s.toUpperCase();
        names.replaceAll(stringUnaryOperator);
        names.forEach(System.out::println);

        System.out.println();


        Comparator<String> comparator = (s1,s2) -> {

            UnaryOperator<String> converter = s -> s.toLowerCase();

            s1 = converter.apply(s1);
            s2 = converter.apply(s2);

            return s1.compareTo(s2);
        };
        Collections.sort(names, comparator);
        names.forEach(System.out::println);

        System.out.println();


        Comparator<String> comparator1 = (s1, s2) -> {

            Function<String,Integer> lengthMeasurer = s-> s.length();
            int i1 = lengthMeasurer.apply(s1);
            int i2 = lengthMeasurer.apply(s2);

            return i1 - i2;
        };
        Collections.sort(strings,comparator1);
        strings.forEach(System.out::println);

    }

    public static ArrayList<String> stringsFactory(){

        ArrayList<String> strings = new ArrayList<>();

        strings.add("Java");
        strings.add("is");
        strings.add("awesome");
        strings.add("!");

        return strings;
    }

    public static ArrayList<String> namesFactory(){

        ArrayList<String> names = new ArrayList<>();

        names.add("Erdem");
        names.add("Clementine");
        names.add("Max");
        names.add("Alptuğcan");
        names.add("Jack");
        names.add("Kenancan");

        return names;
    }
}
