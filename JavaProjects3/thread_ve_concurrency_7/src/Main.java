import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        BankaHesap hesap = new BankaHesap(1000,"123-45");

        Process1 process1 = new Process1(hesap);
        Thread process2 = new Thread(new Process2(hesap));

        process1.start();
        process2.start();

    }
}
