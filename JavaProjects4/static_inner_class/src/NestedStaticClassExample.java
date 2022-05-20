public class NestedStaticClassExample {

    private int i;
    private static int k = 9;

    public NestedStaticClassExample(int i) {
        this.i = i;
    }

    private static class StaticClass{
        public StaticClass() {
            System.out.println("in StaticClass");
        }

        public void aMethodInStaticClass(int j){
            System.out.println("in aMethodInStaticClass() and j:" + j + " and k:" + k);

            NestedStaticClassExample example = new NestedStaticClassExample(20);
            System.out.println(example.i);

        }
    }

    public static void main(String[] args) {
        NestedStaticClassExample.StaticClass object1 = new NestedStaticClassExample.StaticClass();
        object1.aMethodInStaticClass(15);
    }
}
