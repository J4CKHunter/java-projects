import java.util.Random;

public class Test {
    public static void main(String[] args) {

        // Run -> Edit Configurations -> Add VM option -> ea
        Object connection = setup();
//        assert connection != null;

        assert connection !=null : "Connection is null";

    }

    public static Object setup() {

        if(new Random().nextBoolean()){
            System.out.println("true");
            return true;
        }

        else
            return null;
    }

}
