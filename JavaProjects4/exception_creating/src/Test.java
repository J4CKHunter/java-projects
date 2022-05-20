public class Test {
    public static void main(String[] args) {

        String greet = "hi";
        String greeting = "HEY HELLOOOO";

        String idiot = "idiot";

        try {
            throwsCheckedException(greet);
        } catch (CheckedException e) {
            e.printStackTrace();
        }

//        try {
//            throwsCheckedException(greeting);
//        } catch (CheckedException e) {
//            e.printStackTrace();
//        }

        throwsUncheckedException(idiot);
    }

    public static void throwsCheckedException(String string) throws CheckedException {

        String toUpperCase = string.toUpperCase();
        if (string.equals(toUpperCase))
            throw new CheckedException("Do not yell at me !");

    }

    public static void throwsUncheckedException(String string){

        if(string.equals("idiot"))
            throw new UncheckedException("WHY DID YOU CALL ME IDIOT?");
    }
}
