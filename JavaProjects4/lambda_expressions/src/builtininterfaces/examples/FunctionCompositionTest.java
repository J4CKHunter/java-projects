package builtininterfaces.examples;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionCompositionTest {
    public static void main(String[] args) {

//        andThenANDcompose();
//        predicateAndOr();
    }

    public static void andThenANDcompose(){
        int value, three = 3;

        Function<Integer, Integer> multiplyByFive = i -> i * 5;
        Function<Integer, Integer> addTen = i -> i + 10;

        Function <Integer, Integer>  multiplyByFiveAndThenAddTen = multiplyByFive.andThen(addTen);

        value = multiplyByFiveAndThenAddTen.apply(three);

        System.out.println(three + " multiplyByFiveAndThenAddTen -> " +  value);


        Function<Integer, Integer> addTenAndThenMultiplyByFive = multiplyByFive.compose(addTen);

        value = addTenAndThenMultiplyByFive.apply(three);
        System.out.println(three + " addTenAndThenMultiplyByFive -> " + value );

    }

    public static void predicateAndOr(){

        String name = "Erdem";
        String nickname = "J4ck";
        boolean value;

        Predicate<String> startsWithE = s -> s.startsWith("E");
        Predicate<String> endsWithM = s -> s.endsWith("m");

        Predicate<String> startsWithEandEndsWithM = startsWithE.and(endsWithM);

        value = startsWithEandEndsWithM.test(name);
        System.out.println(value);



        Predicate<String> startsWithX = s -> s.startsWith("x");
        Predicate<String> endsWithQ = s -> s.endsWith("q");

        Predicate<String> startsWithXorEndsWithQ = startsWithX.or(endsWithQ);

        value = startsWithXorEndsWithQ.test(nickname);
        System.out.println(value);



        Predicate<String> notStartsWithX = startsWithX.negate();

        value = notStartsWithX.test(nickname);
        System.out.println(value);



//        Predicate.not();
//        Predicate.isEqual();
    }
}
