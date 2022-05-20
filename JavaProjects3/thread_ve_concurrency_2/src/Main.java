public class Main {
    public static void main(String[] args) {

        YeniThread yeniThread = new YeniThread();
        yeniThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim class, 10 saniye sleep " + Thread.currentThread().getName());
                for(int i = 0; i < 10; i++){

                    try {

                        /*if(i == 2)
                            yeniThread.join();*/

                        yeniThread.join();
                        Thread.sleep(1000);


                        /*if(i == 2)
                            yeniThread.interrupt();*/

                        System.out.println(i+1 + ". saniyedeyim (anonim)");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }
}
