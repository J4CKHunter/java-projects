public class Main {
    public static void main(String[] args) {

        GeriSayim geriSayim = new GeriSayim();


        /*GeriSayim geriSayim1 = new GeriSayim();
        GeriSayThread t2 = new GeriSayThread(geriSayim1);*/

        GeriSayThread t1 = new GeriSayThread(geriSayim);
        t1.setName("Thread 1");


        GeriSayThread t2 = new GeriSayThread(geriSayim);
        t2.setName("Thread 2");


        t1.start();
        t2.start();


    }
}

class GeriSayim {

    private int i;

    public synchronized void geriSay(){

        String renk;
        switch (Thread.currentThread().getName()){

            case "Thread 1":
                renk=Renk.ANSI_KIRMIZI;
                break;

            case "Thread 2":
                renk=Renk.ANSI_TURKUAZ;
                break;

            default:
                renk=Renk.ANSI_YESIL;

        }

        for (i = 10; i > 0; i--){
            System.out.println(renk + Thread.currentThread().getName() + " ---- i : " + i);
        }
    }

}

class GeriSayThread extends Thread{

    private GeriSayim geriSayim = new GeriSayim();

    public GeriSayThread(GeriSayim geriSayim){
        this.geriSayim = geriSayim;
    }

    @Override
    public void run() {
        geriSayim.geriSay();
    }
}