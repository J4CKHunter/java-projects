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
public class JavaApplication31Polymorphism1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometrikSekil sekil=new GeometrikSekil();
        Kare kare1=new Kare(6);
        Dikdortgen dd1=new Dikdortgen(6,11);
        
        AlanHesapla(sekil);
        AlanHesapla(kare1);
        AlanHesapla(dd1);
        
    }
    public static void AlanHesapla(GeometrikSekil sekil){
        System.out.println("Alan:"+sekil.AlanBul());
    }
}
