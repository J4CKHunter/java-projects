import java.util.Enumeration;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> sayilar = new Stack<>();
        sayilar.push(5);
        sayilar.push(9);
        sayilar.push(15);

        System.out.println("5un yeri: " + sayilar.search(5));
        System.out.println("9un yeri: " + sayilar.search(9));
        System.out.println("15un yeri: " + sayilar.search(15));

        System.out.println("Stackteki elemanlar : " + sayilar.toString());

        System.out.println("Sneak peak : " + sayilar.peek());

        sayilar.pop();

        System.out.println("9un yeri: " + sayilar.search(9));

        System.out.println("Stackteki elemanlar : " + sayilar.toString() + "\n");


        // yazdırmak için 2. yol = iteration = vectörlerde iteration => enumeration
        // stack, vectorden turetildi => enumeration

        Enumeration<Integer> enumeration = sayilar.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


    }
}
