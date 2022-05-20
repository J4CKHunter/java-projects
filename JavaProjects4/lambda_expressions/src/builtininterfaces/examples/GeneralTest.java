package builtininterfaces.examples;

import java.util.Comparator;
import java.util.Date;
import java.util.function.*;

public class GeneralTest {
    public static void main(String[] args) {

//        function();
//        biFunction();
//        consumer();
//        biConsumer();
//        supplier();
//        predicate();
//        biPredicate();
        //unaryOperator de var
//        binaryOperator();
        primitiveTypes();

    }

    public static void function(){

        Function<String, Integer> function1 = arg1 -> arg1.length();
        int length = function1.apply("erdem");
        System.out.println(length);

        Function<Integer, Double> function2 = arg1 -> (double)arg1/5;
        double divFive = function2.apply(13);
        System.out.println(divFive);
    }

    public static void biFunction(){

        BiFunction<String, String, Boolean> function1 = (arg1, arg2) -> arg2.contentEquals(arg1);
        boolean temp = function1.apply("erdem", "erdem");
        System.out.println(temp);

        BiFunction<Integer, Integer, Boolean> isGreaterThan = (num1, num2) -> num1 > num2;
        temp = isGreaterThan.apply(156, 1000);
        System.out.println(temp);

        BiFunction<Integer,Integer,Integer> power = (num1, num2) -> (int)Math.pow(num1,num2);
        int value = power.apply(2,10);
        System.out.println(value);
    }

    public static void consumer(){

        Consumer<String> lowerCaseConverter = s -> System.out.println(s.toLowerCase());
        lowerCaseConverter.accept("ErDeM nAyIn");

    }

    public static void biConsumer(){

        BiConsumer<String, String> concat = (s1, s2) -> System.out.println(s1 +s2);
        concat.accept("Erdem Nayin", " 180202050");
    }

    public static void supplier(){

        Supplier<String> string = () -> "Java is fun!";
        String s = string.get();
        System.out.println(string.get());

        Supplier<Date> now = () -> new Date();
        System.out.println(now.get());

    }

    public static void predicate(){

        boolean temp;

        Predicate<String> stringLengthPredicate = s -> s.length() > 10;
        temp = stringLengthPredicate.test("Erdem");
        System.out.println(temp);

        Predicate<Integer> isEven = i -> {
          if(i % 2 == 0)
              return true;
          else
              return false;
        };

        temp = isEven.test(14);
        System.out.println(temp);

        Predicate<Integer> isEven1 = i -> i % 2 == 0;
        temp = isEven1.test(7);
        System.out.println(temp);

        Predicate<Integer> isEven1Not = Predicate.not(isEven1);
        temp = isEven1Not.test(7);
        System.out.println(temp);

        Predicate<Integer> isPositive = i -> i >= 0;
        temp = isPositive.test(-3);
        System.out.println(temp);

        Predicate<Integer> isBothEvenAndPositive = isEven1.and(isPositive);
        temp = isBothEvenAndPositive.test(16);
        System.out.println(temp);

    }

    public static void biPredicate(){

        boolean test;
        BiPredicate<Integer,Integer> isGreaterThan = (i,j) -> i > j;
        test = isGreaterThan.test(5,3);
        System.out.println(test);
    }

    public static void binaryOperator(){

        int value;

        BinaryOperator<Integer> add = (i, j) -> i + j;
        value = add.apply(3, 9);
        System.out.println(value);

        Comparator<Integer> integerComparator = (i, j) -> i - j;
        BinaryOperator<Integer> maxOperator = BinaryOperator.maxBy(integerComparator);
        value = maxOperator.apply(15,10);
        System.out.println(value);
    }

    public static void primitiveTypes(){

        int intValue;
        double doubleValue;
        long longValue;
        boolean temp;

        IntFunction<Integer> fiveAdder = i -> i+5;
        intValue = fiveAdder.apply(15);
        System.out.println(intValue);

        IntToDoubleFunction fiveDivider = i -> (double)i / 5;
        doubleValue = fiveDivider.applyAsDouble(13);
        System.out.println(doubleValue);

        IntToLongFunction nineAdder = i -> (long)i + 9;
        longValue = nineAdder.applyAsLong(3);
        System.out.println(longValue);

        IntConsumer intPrinter = i -> System.out.println("int value is  : " + i);
        intPrinter.accept(9);

//        LongConsumer, DoubleConsumer;

        IntPredicate isLessThen5 = i -> i < 5 ;
        temp = isLessThen5.test(3);
        System.out.println(temp);

//        LongSupplier

    }
}
