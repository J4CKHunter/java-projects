import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> table = new HashMap<>();
        table.put(1,"Erdem");
        table.put(15,"Kerem");
        table.put(9,"Ahmet");
        table.put(-5,"Mehmet");

        System.out.println(table);

        System.out.println(table.size());

        Collection<String> values = table.values();
        System.out.println(values);

        Set<Integer> keys = table.keySet();

        System.out.println(table.entrySet());






    }
}
