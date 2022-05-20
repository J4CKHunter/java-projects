import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Ogrenci erdem = new Ogrenci(180,80);
        Ogrenci kerem = new Ogrenci(170,95);

        TreeSet<Ogrenci> ogrenciKumesi = new TreeSet<>(Collections.reverseOrder());

        System.out.println(ogrenciKumesi.add(erdem));
        System.out.println(ogrenciKumesi.add(kerem));
        System.out.println(ogrenciKumesi.add(erdem) + "\n");

        System.out.println(ogrenciKumesi.add(new Ogrenci(190,60)));
        System.out.println(ogrenciKumesi.add(new Ogrenci(150,85)));
        System.out.println(ogrenciKumesi.add(new Ogrenci(150,85)));

        System.out.println("fore ile geziyoruz \n//////////////////");
        for (Ogrenci temp:ogrenciKumesi
             ) {
            System.out.println(temp.toString());
        }

        System.out.println("\niterator ile geziyoruz\n//////////////////");

        Iterator<Ogrenci> iterator = ogrenciKumesi.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
