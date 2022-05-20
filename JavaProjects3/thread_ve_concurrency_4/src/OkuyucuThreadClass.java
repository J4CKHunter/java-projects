import java.util.Random;

public class OkuyucuThreadClass implements Runnable{

    private Mektup mektup;

    public OkuyucuThreadClass(Mektup mektup) {
        this.mektup = mektup;
    }

    @Override
    public void run() {
        Random rand = new Random();

        for(String sonMesaj = mektup.oku(); !sonMesaj.equals("SON"); sonMesaj = mektup.oku()){

            System.out.println(sonMesaj);
            try {
                Thread.sleep(rand.nextInt(4000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
