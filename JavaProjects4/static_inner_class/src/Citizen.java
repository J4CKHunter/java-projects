public class Citizen {

    private final String TCKN;
    private String firstName;
    private String lastName;
    private Nationality nationality;

    public static String staticTest = "staticTest";

    public Citizen(String TCKN, String firstName, String lastName, Nationality nationality) {
        this.TCKN = TCKN;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    static class Nationality{

        private String country;
        private String abbreviation;

        public Nationality(String country, String abbreviation) {
            this.country = country;
            this.abbreviation = abbreviation;
        }

        public void accessTest(){
//            System.out.println(firstName + lastName);
            System.out.println(staticTest);

            Citizen citizenAccessTest = new Citizen("1", "a","b", new Nationality("turkey","tr"));
            System.out.println(citizenAccessTest.getTCKN());
            System.out.println(citizenAccessTest.getFirstName());
            System.out.println(citizenAccessTest.getLastName());
            System.out.println(citizenAccessTest.getNationality());

        }

        public String getCountry() {
            return country;
        }

        public String getAbbreviation() {
            return abbreviation;
        }

        @Override
        public String toString()  {
            return "Nationality [country=" + country + ", abbreviation=" + abbreviation + "]";
        }
    }

    public String getTCKN() {
        return TCKN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Nationality getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Citizen [tckn=" + TCKN + ", firstName=" + firstName + ", lastName=" + lastName + ", nationality=" + nationality + "]";
    }
}
