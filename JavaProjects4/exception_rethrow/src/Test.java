public class Test {
    public static void main(String[] args) {

        try {
            secondMethod();
        } catch (Exception e) {
            System.out.println("Main caught it, im gonna eat you alive! nom nom nom");
        }
    }

    public static void firstMethod() throws Exception{
        System.out.println("I'm in firstMethod, im throwing an exception now !");
        throw new Exception();
    }

    public static void secondMethod() throws Exception{
        try {
            firstMethod();
        } catch (Exception e) {
            System.out.println("Exception catched in secondMethod and i don't know how to deal with it, im throwing it too");
            throw e;
        }
    }
}
