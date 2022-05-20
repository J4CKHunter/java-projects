import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> sayilar = new LinkedList<>();
        siraliEkle(sayilar,5);
        siraliEkle(sayilar,1);
        siraliEkle(sayilar,3);
        siraliEkle(sayilar,8);
        printList(sayilar);

    }

    public static void siraliEkle(LinkedList<Integer> temp , int x){

        ListIterator<Integer> iterator = temp.listIterator();


         while(iterator.hasNext()){

             if(iterator.next() <= x ){
                 iterator.add(x);
             }

             else if(iterator.next() > x){
                 iterator.previous();
                 iterator.add(x);
                 iterator.next();
             }

         }

         if(temp.isEmpty()){
             temp.add(x);
         }



    }
    public static void printList(LinkedList<Integer> temp){
        for (int x:temp
             ) {
            System.out.println(temp);
        }
    }
}
