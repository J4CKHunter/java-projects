import java.io.Serializable;

public class Test {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

//        processString(stringBuilder);
        processString(stringBuffer);
    }

    private static void processString(StringBuilder stringBuilder) {


        stringBuilder.append("Hello world! I'm getting use to Java!");
        System.out.println(stringBuilder); // it calls .toString() method automatically

        String reversedString = stringBuilder.reverse().toString();
        System.out.println(reversedString);

        String replacedString = stringBuilder.replace(3,5,"Zort").toString();
        System.out.println(replacedString);

        reversedString = stringBuilder.reverse().toString();
        System.out.println(reversedString);

        stringBuilder.append(" How ");
        stringBuilder.append(" about ");
        stringBuilder.append(" you ? ");
        System.out.println(stringBuilder); // it calls .toString() method automatically

        stringBuilder.setCharAt(20, '#');
        System.out.println(stringBuilder);

        stringBuilder.delete(3,9);
        System.out.println(stringBuilder);

//        stringBuilder.replace(10,15,"xx");
//        stringBuilder.replace(10,15,"xxxxx");
        stringBuilder.replace(10,15,"xxxxxxx");
        System.out.println(stringBuilder);

        stringBuilder.append(stringBuilder.toString());
        System.out.println(stringBuilder);


        stringBuilder.insert(15,"Erdem");
        System.out.println(stringBuilder);

        var index1 = stringBuilder.indexOf("Erdem");
        System.out.println("index of Erdem : " + index1);

        var index2 = stringBuilder.indexOf("use",30);
        System.out.println("index of use after index 30 : " + index2);

        var index3 = stringBuilder.lastIndexOf("to");
        System.out.println("last index of to : " + index3);

        var index4 = stringBuilder.lastIndexOf("x", 30);
        System.out.println("last index of troZ before index 30 : " + index4);

        var capacity = stringBuilder.capacity();
        System.out.println("Capacity : " + capacity);

        var length = stringBuilder.length();
        System.out.println("Length : " + length);


        stringBuilder.trimToSize();
        capacity = stringBuilder.capacity();
        System.out.println("Capacity after trimToSize() : " + capacity);

        stringBuilder.trimToSize();
        capacity = stringBuilder.capacity();
        System.out.println("Capacity after trimToSize() again : " + capacity);

        stringBuilder.setLength(500);
        length = stringBuilder.length();
        capacity = stringBuilder.capacity();
        System.out.println("Length after setLength(500) : " + length);
        System.out.println("Capacity after setLength(500) : " + capacity);

        String subString = stringBuilder.substring(15,30);
        System.out.println("Substring 15-30 : " + subString);

    }
    private static void processString(StringBuffer stringBuilder) {

        stringBuilder.append("Hello world! I'm getting use to Java!");
        System.out.println(stringBuilder); // it calls .toString() method automatically

        String reversedString = stringBuilder.reverse().toString();
        System.out.println(reversedString);

        String replacedString = stringBuilder.replace(3,5,"Zort").toString();
        System.out.println(replacedString);

        reversedString = stringBuilder.reverse().toString();
        System.out.println(reversedString);

        stringBuilder.append(" How ");
        stringBuilder.append(" about ");
        stringBuilder.append(" you ? ");
        System.out.println(stringBuilder); // it calls .toString() method automatically

        stringBuilder.setCharAt(20, '#');
        System.out.println(stringBuilder);

        stringBuilder.delete(3,9);
        System.out.println(stringBuilder);

//        stringBuilder.replace(10,15,"xx");
//        stringBuilder.replace(10,15,"xxxxx");
        stringBuilder.replace(10,15,"xxxxxxx");
        System.out.println(stringBuilder);

        stringBuilder.append(stringBuilder.toString());
        System.out.println(stringBuilder);


        stringBuilder.insert(15,"Erdem");
        System.out.println(stringBuilder);

        var index1 = stringBuilder.indexOf("Erdem");
        System.out.println("index of Erdem : " + index1);

        var index2 = stringBuilder.indexOf("use",30);
        System.out.println("index of use after index 30 : " + index2);

        var index3 = stringBuilder.lastIndexOf("to");
        System.out.println("last index of to : " + index3);

        var index4 = stringBuilder.lastIndexOf("x", 30);
        System.out.println("last index of troZ before index 30 : " + index4);

        var capacity = stringBuilder.capacity();
        System.out.println("Capacity : " + capacity);

        var length = stringBuilder.length();
        System.out.println("Length : " + length);


        stringBuilder.trimToSize();
        capacity = stringBuilder.capacity();
        System.out.println("Capacity after trimToSize() : " + capacity);

        stringBuilder.trimToSize();
        capacity = stringBuilder.capacity();
        System.out.println("Capacity after trimToSize() again : " + capacity);

        stringBuilder.setLength(500);
        length = stringBuilder.length();
        capacity = stringBuilder.capacity();
        System.out.println("Length after setLength(500) : " + length);
        System.out.println("Capacity after setLength(500) : " + capacity);

        String subString = stringBuilder.substring(15,30);
        System.out.println("Substring 15-30 : " + subString);
    }
}
