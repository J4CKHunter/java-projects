import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankaHesap {

    private double bakiye;
    private String hesapNo;
    private ReentrantLock reentrantLock;

    public BankaHesap(double bakiye, String hesapNo) {
        this.bakiye = bakiye;
        this.hesapNo = hesapNo;
        this.reentrantLock = new ReentrantLock();
    }

    public void paraYatir(Double miktar){

        boolean sonuc = false;

        try {
            if(reentrantLock.tryLock(5000, TimeUnit.MILLISECONDS)){
                try{

                    bakiye += miktar;
                    System.out.println(miktar + " yatirildi. Bakiye : " + getBakiye());
                    sonuc = true;
                }finally {
                    reentrantLock.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Kitlenmedi.");
        }

    }

    public void paraCek(Double miktar){

        boolean sonuc = false;

        try {
            if(reentrantLock.tryLock(5000,TimeUnit.MILLISECONDS)){
                try{

                    bakiye -= miktar;
                    System.out.println(miktar + " cekildi. Bakiye : " + getBakiye());
                    sonuc = true;
                }finally {
                    reentrantLock.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Kitlenmedi");
        }

    }

    public double getBakiye() {
        return bakiye;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void hesapNoYazdir(){
        System.out.println("Hesap no: " + getHesapNo());
    }
}
