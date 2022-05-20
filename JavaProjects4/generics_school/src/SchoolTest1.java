import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolTest1 {
    public static void main(String[] args) {
//        processTeachers();
        processAssistantPrincipals();
    }



    private static void processTeachers() {
        List<Teacher> teachers = new ArrayList<>();

        Teacher t1 = new Teacher(41, "Ayse", "Math");
        teachers.add(t1);
        Teacher t2 = new Teacher(22, "Mahmut", "Turkish");
        teachers.add(t2);
        Teacher t3 = new Teacher(63, "Kemal", "English");
        teachers.add(t3);
        Teacher t4 = new Teacher(92, "Murat", "Biology");
        teachers.add(t4);
        Teacher t5 = new Teacher(9, "Lale", "Chemistry");
        teachers.add(t5);
        Teacher t6 = new Teacher(19, "Deniz", "Art");
        teachers.add(t6);
        Teacher t7 = new Teacher(5, "Remzi", "IT");
        teachers.add(t7);

        System.out.println("Before sorting Teachers: ");
        teachers.forEach(System.out::println);
        Collections.sort(teachers);
        System.out.println("\nAfter sorting Teachers: ");
        teachers.forEach(System.out::println);

        Collections.shuffle(teachers);
        System.out.println("\nAfter shuffling Teachers: ");
        teachers.forEach(System.out::println);

        System.out.println("\nBefore sorting TeacherComparator : ");
        teachers.forEach(System.out::println);
        Collections.sort(teachers, new TeacherComparator());
        System.out.println("\nAfter sorting TeacherComparator : ");
        teachers.forEach(System.out::println);

        Collections.shuffle(teachers);
        System.out.println("\nAfter shuffling Teachers: ");
        teachers.forEach(System.out::println);

        System.out.println("\nBefore sorting EmployeeComparator : ");
        teachers.forEach(System.out::println);
        Collections.sort(teachers, new EmployeeComparator());
        System.out.println("\nAfter sorting EmployeeComparator : ");
        teachers.forEach(System.out::println);

        System.out.println("\nPosition t2 with TeacherComparator: " + Collections.binarySearch(teachers, t2, new TeacherComparator()));
        System.out.println("\nPosition t2 with EmployeeComparator: " + Collections.binarySearch(teachers, t2, new EmployeeComparator()));
        //System.out.println("\nPosition t2 with AssistantPrincipalComparator: " + Collections.binarySearch(teachers, t2, new AssistantPrincipalComparator()));


    }

    private static void processAssistantPrincipals() {
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

        System.out.println("Before sorting AssistantPrincipals :");
        assitantPrincipals.forEach(System.out::println);
//        comparator'e göre compare eder
//        yani isimlerinin sırasına göre compare eder
        Collections.sort(assitantPrincipals, new AssistantPrincipalComparator());

//        kendi içindeki teacher'ın implemente ettiğ compareTo'ya göre compare eder.
//        yani numaralarına göre compare eder
//        Collections.sort(assitantPrincipals);
        System.out.println("\nAfter sorting AssistantPrincipals :");
        assitantPrincipals.forEach(System.out::println);

        System.out.println("\nMax of AssitantPrincipals: " + Collections.max(assitantPrincipals));
        System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, new AssistantPrincipalComparator()));
        System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, new TeacherComparator()));
        System.out.println("Max of AssitantPrincipals: " + Collections.max(assitantPrincipals, new EmployeeComparator()));

    }
}
