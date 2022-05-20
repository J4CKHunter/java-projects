public class Mektup {

    private String mesaj;
    private boolean okunacakMesajVarMi = false;


    public synchronized String oku(){
        System.out.println(Renk.ANSI_KIRMIZI + "mektup nesnesi oku while");
        while(okunacakMesajVarMi == false){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        okunacakMesajVarMi = false;
        notifyAll();
        return mesaj;
    }

    public synchronized void yaz(String m){
        System.out.println(Renk.ANSI_MAVI + "mektup nesnesi yaz while");

        while(okunacakMesajVarMi == true){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.mesaj = m;
        okunacakMesajVarMi = true;
        notifyAll();

    }


}
