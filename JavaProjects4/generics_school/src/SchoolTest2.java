import java.util.ArrayList;
import java.util.List;

public class SchoolTest2 {

    public static void main(String[] args) {

        List<Teacher> teachers = new ArrayList<>();
        List<AssistantPrincipal> assistantPrincipals = new ArrayList<>();
        List<Principal> principals = new ArrayList<>();

        Teacher t1 = new Teacher(1, "Ayse", "Physics");
        teachers.add(t1);
        Teacher t2 = new Teacher(2, "Mahmut", "Math");
        teachers.add(t2);
        Teacher t3 = new Teacher(3, "Kemal", "Music");
        teachers.add(t3);

        AssistantPrincipal ap1 = new AssistantPrincipal(11, "Zubeyde", "Physics", true);
        assistantPrincipals.add(ap1);
        AssistantPrincipal ap2 = new AssistantPrincipal(21, "Akın", "Math", true);
        assistantPrincipals.add(ap2);

        Principal p1 = new Principal(111, "Betul", "Art", true, 10_000);
        principals.add(p1);

        makeTeachersComittee(teachers);

//        makeManagementComittee(teachers);
        makeManagementComittee(assistantPrincipals);
        makeManagementComittee(principals);

        makeGuardianComittee(teachers);
        makeGuardianComittee(assistantPrincipals);
//        makeGuardianComittee(principals);
    }

    public static void makeTeachersComittee(List<Teacher> teachers){
        System.out.println("A techers comittee is formed by " + teachers.size() + " people.");
    }

    public static void makeManagementComittee(List<? extends AssistantPrincipal> teachers){
        System.out.println("A management comittee is formed by " + teachers.size() + " people.");

    }

    public static void makeGuardianComittee(List<? super AssistantPrincipal> teachers){
        System.out.println("A guardian comittee is formed by " + teachers.size() + " people.");
    }
}
