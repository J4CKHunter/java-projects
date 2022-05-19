/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23.class3.pkgstatic.ve.pkgfinal;

/**
 *
 * @author J4
 */
public class JavaApplication23Class3StaticVeFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("nesne sayisi:"+CemberDaire.getNesneSayisi());
        
        CemberDaire d1=new CemberDaire();
        System.out.println("nesne sayisi(class üzerinden direkt erişim):"+CemberDaire.getNesneSayisi());
        
        CemberDaire d2=new CemberDaire();
        System.out.println("nesne sayisi(d2 üzerinden erişim):"+d2.getNesneSayisi());
        
        CemberDaire d3=new CemberDaire();
        System.out.println("nesne sayisi:"+CemberDaire.getNesneSayisi());
        
        d3.setYaricap(4);
        System.out.println("d3 alan:"+d3.alanHesap());
        System.out.println("d3 çevre:"+d3.cevreHesap());
        
    }
    
}
