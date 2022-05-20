public class LambdaExpressionTest {

    public static void main(String[] args) {
//        firstWay();
//        secondWay();
//        thirdWay();
        fourthWay();
    }

    public static void doMath(Math math, double arg1, double arg2){
        System.out.println(math.calculate(arg1, arg2));
    }

    public static void firstWay(){

        Math multiplier = (double arg1, double arg2) -> {return arg1 * arg2;};

        doMath(multiplier, 3 , 5);
    }

    public static void secondWay(){
        doMath((double arg1, double arg2) -> {return arg1 * arg2;}, 3 , 5);
    }

    public static void thirdWay(){
        doMath((arg1, arg2) -> {return arg1 * arg2;}, 3 , 5);
    }

    public static void fourthWay(){
        doMath(((arg1, arg2) -> arg1 * arg2), 3, 5);
    }
}
