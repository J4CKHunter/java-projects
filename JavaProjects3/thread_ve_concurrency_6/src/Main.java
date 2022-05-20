import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);

        Producer producer = new Producer(buffer, Renk.ANSI_YESIL);
        Consumer consumer = new Consumer(buffer, Renk.ANSI_KIRMIZI);
        Consumer consumer1 = new Consumer(buffer, Renk.ANSI_TURKUAZ);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(producer);
        executorService.execute(consumer);
        executorService.execute(consumer1);

        /*Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable geri dönen bilgi" + Thread.currentThread().getName();
            }
        });

        try {
            System.out.println(future.get() + " " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/

        executorService.shutdown();



        /*new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer1).start();*/

    }
}
