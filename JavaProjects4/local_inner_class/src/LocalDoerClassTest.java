public class LocalDoerClassTest {

    private int testValue = 2;
    private static int staticTestValue = 5;

    public static void main(String[] args) {
//        int testValue = 5;
//        static final int testValuee = 5;

        class LocalDoerClassInMain implements DoerInterface{
            @Override
            public void doIt() {
                System.out.println("staticTestValue" + staticTestValue);
//                System.out.println(testValue);
                System.out.println("i always do it");
            }

            @Override
            public void doThat() {
                System.out.println("staticTestValue" + staticTestValue);
//                System.out.println(testValue);
                System.out.println("i always do it");
            }
        }

        LocalDoerClassInMain object1 = new LocalDoerClassInMain();
        object1.doIt();
        object1.doThat();

        System.out.println();
        System.out.println();

        LocalDoerClassTest aMethodTest = new LocalDoerClassTest();
        aMethodTest.aMethodInOuterClass();

    }

    public void aMethodInOuterClass(){
        class LocalDoerClass implements DoerInterface{

//            LocalDoerClassInMain lm = new LocalDoerClassInMain();
            @Override
            public void doIt() {
                System.out.println("TestValue" + testValue);
                System.out.println("I always do it :)");
            }

            @Override
            public void doThat() {
                System.out.println("staticTestValue" + staticTestValue);
                System.out.println("I always do that :)");
            }
        }

        LocalDoerClass object1 = new LocalDoerClass();
        object1.doIt();

        LocalDoerClass object2 = new LocalDoerClass();
        object2.doThat();
    }
}
