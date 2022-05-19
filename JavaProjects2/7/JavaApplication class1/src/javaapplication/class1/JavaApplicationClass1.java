/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.class1;

/**
 *
 * @author J4
 */
public class JavaApplicationClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Araba erdem_araba=new Araba();
        erdem_araba.setYil(2019);
        System.out.println("Arabamin yili:"+erdem_araba.getYil());
        
        Araba kerem_araba=new Araba();
        kerem_araba.setYil(2018);
        System.out.println("Kerem araba yili:"+kerem_araba.getYil());
        
        kerem_araba=erdem_araba;
        
        System.out.println("\nkerem araba yili:"+kerem_araba.getYil());
        
        Araba aile=new Araba();
        aile.setAd("Mercedes C Class");
        System.out.println("Aile arabasi modeli:"+aile.getAd());
        
    }
    
}
