import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        String[] isimler = {"Erdem","Ayşe","Ali","Berk","Ayşe","Guzide","Ali","Can"};
        LinkedHashSet<String> isimlerLinkedHashSet = new LinkedHashSet<>();

        for (String t:isimler
             ) {
            if(isimlerLinkedHashSet.add(t)){
                System.out.println(t + " eklendi");
            }
            else{
                System.out.println(t + " zaten kümede olduğundan eklenmedi.");
            }
        }

        System.out.println("fore ile geziyoruz \n//////////////////////");
        for (String t:isimlerLinkedHashSet
             ) {
            System.out.println(t);
        }

        System.out.println("\niterator ile geziyoruz \n//////////////////////");
        Iterator<String> iterator = isimlerLinkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
