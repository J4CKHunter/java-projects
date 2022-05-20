import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {

    private ArrayBlockingQueue<String> buffer;
    private String renk;

    public Producer(ArrayBlockingQueue<String> buffer, String renk) {
        this.buffer = buffer;
        this.renk = renk;
    }

    @Override
    public void run() {

        String[] numbers = {"1","2","3","4","5"};
        Random random = new Random();

        for (String number:numbers) {

            System.out.println(renk + number +" ekleniyor...");

            try {
                buffer.put(number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            try{
                Thread.sleep((random.nextInt(2)+1) * 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

        System.out.println(renk + "EOF ekleniyor...");
        try {
            buffer.put("EOF");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
