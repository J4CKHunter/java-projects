public class CitizenTest {

    public static void main(String[] args) {
        Citizen.Nationality english = new Citizen.Nationality("england","en");
        english.accessTest();

        Citizen citizen1 = new Citizen("123","er","na",english);
        System.out.println(citizen1);
        citizen1.getNationality().accessTest();
    }
}
