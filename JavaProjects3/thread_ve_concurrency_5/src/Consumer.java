import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable {

    ArrayList<String> buffer;
    String renk;
    ReentrantLock bufferLock;

    public Consumer(ArrayList<String> buffer, String renk, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.renk = renk;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {

        while(true){

            /*synchronized (buffer){

                if(buffer.isEmpty()){
                    continue;
                }
                if(buffer.get(0).equals("EOF")){
                    System.out.println(renk + "Cikis yapiliyor...");
                    return;
                }
                else{
                    System.out.println(renk + buffer.remove(0) + " kaldiriliyor...");

                }
            }*/


            if(bufferLock.tryLock()){
                try{

                    //bufferLock.lock();

                    if(buffer.isEmpty()){
                        continue;
                    }
                    if(buffer.get(0).equals("EOF")){
                        System.out.println(renk + "Cikis yapiliyor...");
                        return;
                    }
                    else{
                        System.out.println(renk + buffer.remove(0) + " kaldiriliyor...");
                    }

                }finally {
                    bufferLock.unlock();
                }
            }


        }
    }
}
