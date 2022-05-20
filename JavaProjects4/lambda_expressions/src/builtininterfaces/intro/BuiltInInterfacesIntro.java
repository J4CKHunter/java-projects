package builtininterfaces.intro;

public class BuiltInInterfacesIntro {
    public static void main(String[] args) {

        boolean temp;
        int value1 = 15, value2 = 13;

        UniIntegerChecker uniIntegerChecker1 = i -> i > 5;
        temp = uniIntegerChecker1.check(value1);
        System.out.println(temp);

        UniIntegerChecker uniIntegerChecker2 = i -> i == 3;
        temp = uniIntegerChecker2.check(value1);
        System.out.println(temp);


        BiIntegerChecker biIntegerChecker1 = (i, j) -> i > j;
        temp = biIntegerChecker1.check(value1, value2);
        System.out.println(temp);

        BiIntegerChecker biIntegerChecker2 = (i, j) -> i == j;
        temp = biIntegerChecker2.check(value1, value2);
        System.out.println(temp);


        StringAnalyzer stringAnalyzer1 = (arg1, arg2) -> arg2.startsWith(arg1);
        temp = stringAnalyzer1.analyze("e", "erdem");
        System.out.println(temp);

        StringAnalyzer stringAnalyzer2 = (arg1, arg2) -> arg2.contains(arg1);
        temp = stringAnalyzer2.analyze("b", "erdem");
        System.out.println(temp);
    }
}
