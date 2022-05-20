import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SchoolTest3 {
    public static void main(String[] args) {

        List<AssistantPrincipal> assitantPrincipals = new ArrayList<>();

        AssistantPrincipal ap1 = new AssistantPrincipal(111, "Zubeyde", "Art", true);
        assitantPrincipals.add(ap1);
        AssistantPrincipal ap2 = new AssistantPrincipal(121, "Akın",  "Programming", true);
        assitantPrincipals.add(ap2);
        AssistantPrincipal ap3 = new AssistantPrincipal(639, "Yeliz",  "Physics", true);
        assitantPrincipals.add(ap3);
        AssistantPrincipal ap4 = new AssistantPrincipal(961, "Berrin",  "Biology", true);
        assitantPrincipals.add(ap4);
        AssistantPrincipal ap5 = new AssistantPrincipal(311, "Murat",  "Physics", false);
        assitantPrincipals.add(ap5);
        AssistantPrincipal ap6 = new AssistantPrincipal(396, "Temel",  "Biology", true);
        assitantPrincipals.add(ap6);

        System.out.println("Before sorting by number : ");
        assitantPrincipals.forEach(System.out::println);

        Comparator<AssistantPrincipal> compareByNumber = (apr1, apr2 ) -> apr1.getNo() - apr2.getNo();
        Collections.sort(assitantPrincipals, compareByNumber);
        System.out.println("\nAfter sorting by number : ");
        assitantPrincipals.forEach(System.out::println);


        System.out.println("\nBefore sorting by name : ");
        assitantPrincipals.forEach(System.out::println);

        Comparator<AssistantPrincipal> compareByFirstName = (apr1, apr2) -> apr1.getName().compareTo(apr2.getName()) ;
        Collections.sort(assitantPrincipals, compareByFirstName);
        System.out.println("\nAfter sorting by name : ");
        assitantPrincipals.forEach(System.out::println);


        System.out.println("\nBefore sorting by major :");
        assitantPrincipals.forEach(System.out::println);

        Comparator<AssistantPrincipal> compareByMajor = (apr1, apr2) -> apr1.getMajor().compareTo(apr2.getMajor());
        Collections.sort(assitantPrincipals, compareByMajor);
        System.out.println("\nAfter sorting by major :");
        assitantPrincipals.forEach(System.out::println);

        //Comparator Composition

        System.out.println("\nBefore comparator composition : ");
        assitantPrincipals.forEach(System.out::println);


        Comparator<AssistantPrincipal> compareByNumberAndThenByFirstNameAndThenByMajor =
                compareByNumber.thenComparing(compareByFirstName).thenComparing(compareByMajor);
        Collections.sort(assitantPrincipals, compareByNumberAndThenByFirstNameAndThenByMajor);
        System.out.println("\nAfter comparator composition : by Number -> by Name -> by Major :");
        assitantPrincipals.forEach(System.out::println);


    }
}
