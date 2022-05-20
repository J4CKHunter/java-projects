import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> table = new LinkedHashMap<>();
        table.put(15,"Erdem");
        table.put(-5,"Kerem");
        table.put(3 ,"Ahmet");
        table.put(9 ,"Mehmet");
        System.out.println(table);

        LinkedHashMap<Integer,String> newTable = new LinkedHashMap<>(table);
        newTable.put(99,"Beşiktaş");
        newTable.put(180,"Kadiköy");
        System.out.println(newTable);

        LinkedHashMap<Integer,String> tablo = new LinkedHashMap<>(16,0.75f,false);
        tablo.put(15,"Erdem");
        tablo.put(-5,"Kerem");
        tablo.put(3 ,"Ahmet");
        tablo.put(9 ,"Mehmet");
        System.out.println(tablo);


        TreeMap<Integer,String> treemap = new TreeMap<>(tablo);
        System.out.println(treemap);


        System.out.println();System.out.println();

        System.out.println("fore ile keyleri gezelim\n////////////////////////");
        for (int x:newTable.keySet()
             ) {
            System.out.println("Anahtar : " + x);
        }

        System.out.println("fore ile valueleri gezelim\n/////////////////////////");
        for (String temp:newTable.values()
             ) {
            System.out.println("Değer : " + temp);
        }

        System.out.println("fore ile aynı anda key valueleri gezelim\n///////////////////////");
        for (Map.Entry<Integer,String> temp: newTable.entrySet()
             ) {
            System.out.println("Key = " + temp.getKey() + " Value = " + temp.getValue());
        }

        System.out.println("iterator ile aynı anda key valueleri gezelim\n////////////////////////");
        Iterator<Map.Entry<Integer,String>> iterator = newTable.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer,String> temp = iterator.next();
            System.out.println("Key = " + temp.getKey() + " Value = " + temp.getValue());
        }
    }
}
