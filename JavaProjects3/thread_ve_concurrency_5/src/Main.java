import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> buffer = new ArrayList<>();
        ReentrantLock bufferLock = new ReentrantLock();


        Producer producer = new Producer(buffer, Renk.ANSI_YESIL, bufferLock);
        Consumer consumer = new Consumer(buffer, Renk.ANSI_KIRMIZI, bufferLock);
        Consumer consumer1 = new Consumer(buffer, Renk.ANSI_TURKUAZ, bufferLock);

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer1).start();
    }
}
