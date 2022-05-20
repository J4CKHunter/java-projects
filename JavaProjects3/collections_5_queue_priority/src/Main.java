import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> sayilar = new LinkedList<Integer>();

        sayilar.add(1);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(2);
        sayilar.add(6);

        System.out.println(sayilar.toString());

        System.out.println(sayilar.peek());;

        System.out.println(sayilar.poll());;

        System.out.println(sayilar.peek());;

        System.out.println(sayilar.toString());

        System.out.println(sayilar.remove());

        System.out.println(sayilar.toString());


        Queue<Integer> sayilar2 = new LinkedList<Integer>();

        System.out.println(sayilar2.poll());;
        //System.out.println(sayilar2.remove());

        System.out.println(sayilar2.peek());
        //System.out.println(sayilar2.element());


        System.out.println(sayilar2.offer(9));
        //System.out.println(sayilar2.add("Erdem"));



        PriorityQueue<Integer> öncelikliSayilar = new PriorityQueue<Integer>();

        öncelikliSayilar.add(5);
        öncelikliSayilar.add(9);
        öncelikliSayilar.add(3);
        öncelikliSayilar.add(15);

        System.out.println(öncelikliSayilar);


        PriorityQueue<String> isimler = new PriorityQueue<>();

        isimler.offer("Erdem");
        isimler.offer("Zade");
        isimler.offer("Ahmet");
        isimler.offer("Kerem");

        System.out.println(isimler.toString());


        PriorityQueue<Integer> tersÖncelikliSayilar = new PriorityQueue<>(Collections.reverseOrder());

        tersÖncelikliSayilar.offer(5);
        tersÖncelikliSayilar.offer(9);
        tersÖncelikliSayilar.offer(3);

        System.out.println(tersÖncelikliSayilar.toString());







        Ogrenci erdem = new Ogrenci(180202050,95);
        Ogrenci ali = new Ogrenci(180201075,100);
        Ogrenci ahmet = new Ogrenci(180201150,60);

        PriorityQueue<Ogrenci> ogrenciler = new PriorityQueue<>();

        ogrenciler.add(erdem);
        ogrenciler.add(ali);
        ogrenciler.add(ahmet);

        ogrenciler.add(new Ogrenci(170202015,75));
        ogrenciler.add(new Ogrenci(180202123,55));
        ogrenciler.add(new Ogrenci(160201128,64));

        while(!ogrenciler.isEmpty()){
            System.out.println(ogrenciler.poll());
        }

    }
}
