public class LocalClassExample {

    static String testStatic = "testStatic";

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2){

        final int finalNumberLength = 10;

        int effectivelyFinalNumberLength = 10;


        class PhoneNumber{
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){

                System.out.println("testStatic" + testStatic);
                System.out.println("access outer class's final class variable " + finalNumberLength);
                System.out.println("access outer class's effectively final class variable " + effectivelyFinalNumberLength);

                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if(currentNumber.length() == effectivelyFinalNumberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;

            }
            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in JDK 8 and later:
            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);

            }
         }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Valid in JDK 8 and later:

        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid!");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid!");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }
    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }

}
