import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable {

    ArrayBlockingQueue<String> buffer;
    String renk;

    public Consumer(ArrayBlockingQueue<String> buffer, String renk) {
        this.buffer = buffer;
        this.renk = renk;
    }

    @Override
    public void run() {

        while(true){

            synchronized (buffer){

                if(buffer.isEmpty()){
                    continue;
                }
                if(buffer.peek().equals("EOF")){
                    System.out.println(renk + "Cikis yapiliyor...");
                    return;
                }
                else{
                    try {
                        System.out.println(renk + buffer.take() + " kaldiriliyor...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }


        }


    }
}

