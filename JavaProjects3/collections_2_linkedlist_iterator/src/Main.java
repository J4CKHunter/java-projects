

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> tatilRotam = new LinkedList<>();
        tatilRotam.add("İstanbul");
        tatilRotam.add("Roma");
        tatilRotam.add("Milan");
        tatilRotam.add("Paris");
        tatilRotam.add("Köln");

        printRotam(tatilRotam);


        tatilRotam.add(2,"Modena");

        printRotam(tatilRotam);

    }

    public static void printRotam(LinkedList<String> temp){

        ListIterator<String> iterator = temp.listIterator();

        while(iterator.hasNext()){


            System.out.print(iterator.next());

            if(iterator.hasNext())
                System.out.print(" ---> ");
        }
        System.out.println();
    }

}
