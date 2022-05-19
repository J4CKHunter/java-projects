/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31.polymorphism1;

/**
 *
 * @author J4
 */
public class instanceofkavrami {
    public static void main(String[] args) {
        
        GeometrikSekil gs1=new GeometrikSekil();
        Kare k1=new Kare(7);
        Dikdortgen dd1=new Dikdortgen(8,14);
        
        sekilAlanHesapla(gs1);
        sekilAlanHesapla(k1);
        sekilAlanHesapla(dd1);
        
    }
    private static void sekilAlanHesapla(Object nesne){
        if(nesne instanceof GeometrikSekil){
            GeometrikSekil gs=(GeometrikSekil)nesne;
            System.out.println("Alan: "+gs.AlanBul());
        }
        else if(nesne instanceof Kare){
            Kare k=(Kare)nesne;
            System.out.println("Alan: "+k.AlanBul());
        }
        
        else{
            Dikdortgen g=(Dikdortgen)nesne;
            System.out.println("Alan: "+g.AlanBul());
        }
    }
}
