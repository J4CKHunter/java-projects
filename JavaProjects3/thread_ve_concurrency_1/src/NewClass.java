public class NewClass extends Thread {

    @Override
    public void run() {
        System.out.println("Merhaba extend Thread, " + Thread.currentThread().getName());
    }
}
