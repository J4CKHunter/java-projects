import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

//        hashSetImplementations();
//        treeSetImplementations();
//        arrayListImplementations();
//        linkedListImplementations();
//        hashMapImplementations();
    }

    public static void hashSetImplementations(){

        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        HashSet<Integer> hashSet4 = new HashSet<>(100);
        HashSet<Integer> hashSet5 = new HashSet<Integer>(100, (float)0.75);


        for (int i = 0; i < 100; i++) {
            hashSet1.add(i);
            hashSet2.add(i*2);
        }

        Iterator iterator1 = hashSet1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println();
        hashSet1.addAll(hashSet2);
        hashSet1.forEach(System.out::println);

        System.out.println();
        Predicate<Integer> integerPredicate = i -> i % 5 == 0;
        hashSet1.removeIf(integerPredicate);
        hashSet1.forEach(System.out::println);

        System.out.println();
        Set<String> set = Set.of("Erdem", "Nayin", "180202050");
//        .of -> creates immutable object
//        set.remove("Erdem");
        set.forEach(System.out::println);

        System.out.println();
        boolean b1 = hashSet2.contains(99);
        boolean b2 = hashSet2.contains(100);
        System.out.println("b1 " + b1 + " b2 " + b2);

        System.out.println();
        HashSet<Integer> hashSet3 = new HashSet<>(hashSet2);
        hashSet3.forEach(System.out::println);

    }

    public static void treeSetImplementations(){

        TreeSet<Integer> treeSet1 = new TreeSet<>();

        for (int i = 100; i > -1; i--) {
            treeSet1.add(i);
        }

        treeSet1.forEach(System.out::println);

    }

    public static void arrayListImplementations(){
        ArrayList<Integer> arrayList1= new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList1.add(i);
        }

//        arrayList1.forEach(System.out::println);

        ListIterator<Integer> listIterator = arrayList1.listIterator();
        while(listIterator.hasNext()){
            int i = listIterator.next();
            System.out.println(i);
            if(i == 5)
                listIterator.remove();

        }

        System.out.println();
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println();
        UnaryOperator<Integer> integerUnaryOperator = i -> (i*3) + 5 ;
        arrayList1.replaceAll(integerUnaryOperator);
        arrayList1.forEach(System.out::println);


        ArrayList<String> arrayList2 =  new ArrayList<>();
        arrayList2.add("Erdem");
        arrayList2.add("Keremcan");
        arrayList2.add("Samet");
        arrayList2.add("Atilla");
        arrayList2.add("Altan");
        arrayList2.add("Muvaffakiyetsiz");

        System.out.println();
        Comparator<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
        arrayList2.sort(stringComparator);
        arrayList2.forEach(System.out::println);

        System.out.println();
        Predicate<String> stringPredicate = s -> s.length() > 5;
        arrayList2.removeIf(stringPredicate);
        arrayList2.forEach(System.out::println);

        System.out.println();
        ArrayList<String> arrayList3 = new ArrayList<>(arrayList2);
        arrayList3.forEach(System.out::println);

    }

    public static void linkedListImplementations(){

        int temp;

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList1.add(i);
        }

        temp = linkedList1.getFirst();
        System.out.println(temp);

        temp = linkedList1.getLast();
        System.out.println(temp);

        linkedList1.offer(5);
        System.out.println(linkedList1.toString());

        linkedList1.offerFirst(19);
        System.out.println(linkedList1.toString());

        temp = linkedList1.peek();
        System.out.println("peek :" +  temp);
        System.out.println(linkedList1.toString());

        temp = linkedList1.poll();
        System.out.println("poll :" + temp);
        System.out.println(linkedList1.toString());

        temp = linkedList1.pop();
        System.out.println("pop = removeFirst :" + temp);
        System.out.println(linkedList1.toString());

        linkedList1.push(99);
        System.out.println("push : 99 -> " + linkedList1.toString());

    }

    public static void hashMapImplementations(){

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Erdem", 22);
        hashMap1.put("Ahmet", 58);
        hashMap1.put("Laila", 21);

        Set<String> keys = hashMap1.keySet();
        Collection<Integer> values = hashMap1.values();
        Set set = hashMap1.entrySet();

        keys.forEach(System.out::println);
        values.forEach(System.out::println);
        System.out.println(set.toString());

        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Integer value = hashMap1.get(key);
            System.out.println("Key : " + key + ", Value : " + value);
        }

        System.out.println();System.out.println();
        hashMap1.forEach( (k, v) -> System.out.println("Key : " + k + ", Value : " + v ));

        boolean b1;
        b1 = hashMap1.containsKey("Erdem");

        boolean b2;
        b2 = hashMap1.containsValue(22);

        boolean b3;
        b3 = hashMap1.isEmpty();

        System.out.println("\nb1 " + b1 + " b2 " + b2 +  " b3 " + b3 + "\n");

        hashMap1.put("Kerem", null);

        hashMap1.merge("Kerem", 18, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(hashMap1.toString());

        hashMap1.merge("Kerem", 50, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(hashMap1.toString());


        hashMap1.computeIfPresent("Erdem", (key, value) -> value +10 );
        System.out.println("\n" + hashMap1.toString());
    }

}
