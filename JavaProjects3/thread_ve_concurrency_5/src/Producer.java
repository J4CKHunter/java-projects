import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {

    private ArrayList<String> buffer;
    private String renk;
    ReentrantLock bufferLock;

    public Producer(ArrayList<String> buffer, String renk, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.renk = renk;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {

        String[] numbers = {"1","2","3","4","5"};
        Random random = new Random();

        for (String number:numbers) {

            System.out.println(renk + number +" ekleniyor...");

            /*synchronized (buffer){
                buffer.add(number);
            }*/

            bufferLock.lock();
            buffer.add(number);
            bufferLock.unlock();


            try{
                Thread.sleep((random.nextInt(2)+1) * 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

        System.out.println(renk + "EOF ekleniyor...");
        /*synchronized (buffer){
            buffer.add("EOF");;
        }*/
        bufferLock.lock();
        buffer.add("EOF");
        bufferLock.unlock();

    }
}
