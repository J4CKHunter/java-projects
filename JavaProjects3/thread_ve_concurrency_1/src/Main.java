public class Main {

    public static void main(String[] args) {


        System.out.println("Merhaba main, " + Thread.currentThread().getName());

        NewClass yeniClass = new NewClass();
        yeniClass.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("Merhaba anonim, " + Thread.currentThread().getName());
            }
        }.start();


        Thread runnableThread = new Thread(new NewClass2());
        runnableThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Merhaba anonim Runabble, " + Thread.currentThread().getName());
            }
        }).start();



        NewClass yeniClasss = new NewClass();
        yeniClasss.start();
    }
}