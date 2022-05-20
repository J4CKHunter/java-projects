public class NewClass2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Merhaba implement Runnable, " + Thread.currentThread().getName());
    }
}
