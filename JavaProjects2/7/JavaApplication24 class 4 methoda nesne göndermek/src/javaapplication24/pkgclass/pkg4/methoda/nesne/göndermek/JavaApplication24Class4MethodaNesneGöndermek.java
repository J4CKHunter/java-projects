/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24.pkgclass.pkg4.methoda.nesne.göndermek;

/**
 *
 * @author J4
 */
public class JavaApplication24Class4MethodaNesneGöndermek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fizoz insan1=new fizoz(170,73);
        
        System.out.println("insan1'in kilosu: "+insan1.getKilo()+"  insan1'in boyu: "+insan1.getBoy());
        int toplam=toplam(insan1.getBoy(),insan1.getKilo());
        System.out.println("insan1'in kilo ve boyu toplamı:"+toplam);
        System.out.println("insan1'in kilosu: "+insan1.getKilo()+"  insan1'in boyu: "+insan1.getBoy());
        
        System.out.println("\n\ninsan1'in kilosu: "+insan1.getKilo()+"  insan1'in boyu: "+insan1.getBoy());
        ptoplam(insan1);
        System.out.println("insan1'in kilosu: "+insan1.getKilo()+"  insan1'in boyu: "+insan1.getBoy());
        int toplam2=toplam(insan1.getBoy(),insan1.getKilo());
        System.out.println("insan1'in kilo ve boyu toplamı:"+toplam2);
        System.out.println("insan1'in kilosu: "+insan1.getKilo()+"  insan1'in boyu: "+insan1.getBoy());
        
    }

    private static int toplam(int boy, int kilo) {
        boy=180;
        kilo=80;
        return boy+kilo;
    }

    private static void ptoplam(fizoz insan1) {
        insan1.setBoy(180);
        insan1.setKilo(80);
    }
    
}
