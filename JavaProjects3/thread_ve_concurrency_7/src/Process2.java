public class Process2 implements Runnable{

    BankaHesap hesap;

    public Process2(BankaHesap hesap){
        this.hesap = hesap;
    }

    @Override
    public void run() {

        hesap.paraYatir((double) 150);
        hesap.paraCek((double) 350);
        System.out.println("Hesap no: " + hesap.getHesapNo());
    }

}
