public class YeniThread extends Thread {

    @Override
    public void run() {
        System.out.println("Merhaba YeniThread extends,5 saniye sleep " + Thread.currentThread().getName());

        for (int i = 0; i < 50; i++){
            try {
                Thread.sleep(1000);
                System.out.println(i+1 + ". saniyedeyim(class)");
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
                return;
            }
        }
    }
}
