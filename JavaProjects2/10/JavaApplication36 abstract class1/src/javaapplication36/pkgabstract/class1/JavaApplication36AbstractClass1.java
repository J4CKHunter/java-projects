/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36.pkgabstract.class1;

/**
 *
 * @author J4
 */
public class JavaApplication36AbstractClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Araba ford=new Ford();
        ford.setAgirlik(1350);
        ford.setMarka("Ford");
        ford.setRenk("kirmizi");
        
        Araba mercedes=new Mercedes();
        mercedes.setAgirlik(975);
        mercedes.setMarka("Mercedes");
        mercedes.setRenk("mavi");
                
        Ford f1=new Ford();
        f1.setAgirlik(750);
        f1.setJantBoyutu(18);
        f1.setMarka("fordf1");
        
        kacYakar(f1);
        kacYakar(ford);
        kacYakar(mercedes);
    }
    public static void kacYakar(Araba a){
        System.out.println(a.getMarka()+" benzin tüketimi: "+a.benzinKulllanimi());
    }
    
}
