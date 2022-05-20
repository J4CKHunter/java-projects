import java.util.Random;

public class YaziciThreadClass implements Runnable{

    private Mektup mektup;

    public YaziciThreadClass(Mektup mektup) {
        this.mektup = mektup;
    }

    @Override
    public void run() {

        String[] yazilacaklar = {"ERDEM", "NAYİN","180202050","CENG"};
        Random rand = new Random();

        for (int i = 0; i < yazilacaklar.length; i++) {
            mektup.yaz(yazilacaklar[i]);
            try {
                Thread.sleep(rand.nextInt(4000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        mektup.yaz("SON");
    }
}
