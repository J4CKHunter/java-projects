public class AnonymousClassTest {
    public static void main(String[] args) {

//        firstWay();
        secondWay();
    }

    public static void doMath(Math math, double arg1, double arg2){
        System.out.println(math.calculate(arg1, arg2));
    }

    public static void firstWay(){

        Math adder = new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1 + arg2;
            }
        };

        doMath(adder, 3,5);

    }

    public static void secondWay(){

        doMath(new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1 + arg2;
            }
        }, 3 , 5);

    }

    public static void thirdWay(){

    }


}
