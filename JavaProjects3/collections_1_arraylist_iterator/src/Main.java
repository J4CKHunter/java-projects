import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String[] isimler = {"Ali","Veli","Ayse","Fatma","Hayriye","Nuriye"};
        String[] soyisimler = {"Aliye","Velican","Ayse","Fatmanur","Hayriye"};

        ArrayList<String> isimlerList = new ArrayList<>();
        ArrayList<String> soyisimlerList = new ArrayList<>();

        for (String temp:isimler
             ) {
            isimlerList.add(temp);
        }

        for (String temp:soyisimler
        ) {
            soyisimlerList.add(temp);
        }

        //  A'NIN B'DEN FARKLI ELEMANLARINI BULMAK İSTİYORUZ.

        //HATA VERİR.String referans tipli temp, şu anda kullanılmakta.Kullanılan şeyi kaldıramaz.
        //Mesela bir video izliyoruz vlc'de.İzlediğimiz sırada videoyu silmeye kalktığımızda hata verir.
        //Aynı mantık.

        /*for (String temp:isimlerList
             ) {
            if(soyisimlerList.contains(temp)){
                isimlerList.remove(temp);
            }
        }*/

        //Listeler üzerinde aynı anda hem gezip hem işlem yapmak için iterator yapısını kullanırız.

        Iterator<String> iterator = isimlerList.listIterator();

        while(iterator.hasNext()){
            if(soyisimlerList.contains(iterator.next())){
                iterator.remove();
            }
        }

        for (String temp:isimlerList
             ) {
            System.out.print(temp + " ");
        }
    }
}
