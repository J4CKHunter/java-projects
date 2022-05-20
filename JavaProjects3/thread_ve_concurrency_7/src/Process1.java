public class Process1 extends Thread {

    BankaHesap hesap;

    public Process1(BankaHesap hesap){
        this.hesap = hesap;
    }

    @Override
    public void run() {

        hesap.paraYatir((double) 400);
        hesap.paraCek((double) 250);
        System.out.println("Hesap no: " + hesap.getHesapNo());
    }
}
