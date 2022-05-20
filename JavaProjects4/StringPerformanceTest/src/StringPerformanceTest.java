public class StringPerformanceTest {

    public static void main(String[] args) {
        buildStringWithPlusOperator("Java", 200_000);
        buildStringWithStringBuilder("Java", 200_000);
        buildStringWithStringBuffer("Java", 200_000);

    }

    public static void buildStringWithPlusOperator(String string, int count){
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            string = string + i;
        }
        long end = System.currentTimeMillis();

        System.out.println("String length: " + string.length());
        System.out.println("String builded with \"+\" operator in " + (end-start) + " ms");

    }

    public static void buildStringWithStringBuilder(String string, int count){
        StringBuilder stringBuilder = new StringBuilder(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("String length: " + stringBuilder.toString().length());
        System.out.println("String builded with StringBuilder in " + (end-start) + " ms");
    }

    public static void buildStringWithStringBuffer(String string, int count){
        StringBuffer stringBuffer = new StringBuffer(string);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            stringBuffer.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("String length: " + stringBuffer.toString().length());
        System.out.println("String builded with StringBuffer in " + (end-start) + " ms");
    }



}
