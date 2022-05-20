import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

    public static void main(String[] args) {

        create();
        ifPresent();
        ifPresentOrElse();
        or();
        orElse();
        orElseThrow();
        useCaseOfOptionalWithStream();

        //OptionalInt,OptionalDouble etc.
    }

    public static void create(){
        //we have to create Optional values using Optional.of() and Optional.ofNullable();

        Optional optional = Optional.ofNullable(null);

        if(optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("Nothing in there!\n");

    }

    public static void ifPresent(){
        Optional optional = Optional.of(5);

        optional.ifPresent(t -> System.out.println("ifPresent : Value is " + t + "\n"));
    }

    public static void ifPresentOrElse(){
        Optional<String> optional = Optional.ofNullable(null);

        optional.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("Nothing present.\n"));
    }

    public static void or(){

        //        Optional optional = Optional.ofNullable(5);
        Optional optional = Optional.ofNullable(null);

        optional = optional.or( () -> Optional.of((int)(1_000_000 * Math.random() )));

        optional.ifPresent(i -> System.out.println("ifPresent : value is " + i + "\n"));
    }

    public static void orElse(){
        Optional<Integer> optional = Optional.ofNullable(null);

        int value = optional.orElse(1000);

        System.out.println("value is : " + value + "\n");
    }

    public static void orElseThrow(){

        Optional<Integer> optional = Optional.ofNullable(null);

        try{
            int newValue = optional.orElseThrow(() -> new NoValueFoundException("orElseThrow : no value present.\n"));
            System.out.println("orElseThrow: value is " + newValue + "\n");
        }catch (NoValueFoundException e){
            System.out.println("NoValueFoundException: " + e.getMessage() + "\n");
        }
    }

    public static void useCaseOfOptionalWithStream(){

        Optional i = getRandomInt();
        Stream stream = i.stream();
        stream.forEach(s -> System.out.println("Stream: value is -> " + s + "\n"));
    }

    public static Optional getRandomInt(){
        Optional optional;
        double chance = Math.random();

        System.out.println("chance is : " + chance);

        if(chance > (double)0.5){
            int value = (int)(Math.random() * 10);
            System.out.println("produced value is : " + value);
            optional = Optional.of(value);
        }
        else{
            optional = Optional.ofNullable(null);
        }

        return optional;
    }

    private static class NoValueFoundException extends Exception {
        public NoValueFoundException(String s) {
            super(s);
        }
    }
}
