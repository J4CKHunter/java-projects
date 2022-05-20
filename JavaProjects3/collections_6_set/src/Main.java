import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String[] isimler = {"Ali","Emre","Ayşe","Ali","Erdem","Enes","Emre"};
        HashSet<String> isimlerKümesi = new HashSet<>();

        for (String temp:isimler
             ) {
            if(isimlerKümesi.add(temp)){
                System.out.println(temp + " kümeye eklendi");
            }
            else
                System.out.println(temp + " kümede olduğundan eklenmedi.");
        }

        System.out.println();System.out.println();
        for (String t:isimlerKümesi
             ) {
            System.out.println(t); // görüldüğü üzere sırasız biçimde yazdırdı.
        }

        Iterator<String> iterator = isimlerKümesi.iterator();

        System.out.println();System.out.println();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();System.out.println();
        iterator = isimlerKümesi.iterator();        // iterator pointerini basa çektik
        while(iterator.hasNext()){
            if(iterator.next().equals("Erdem")){
                iterator.remove();
                System.out.println("Erdem kaldırıldı.");
            }
        }

        System.out.println();System.out.println();
        iterator = isimlerKümesi.iterator();        // iterator pointerini basa çektik
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
