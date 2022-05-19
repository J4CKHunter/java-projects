/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.pkgstatic.inner.pkgclass;

/**
 *
 * @author erdem
 */
public class JavaApplication10StaticInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ogrenci yeniOgrenci=new Ogrenci(180202050,"Erdem");
        System.out.println(Ogrenci.ogrSayisi);
        
        Ogrenci yeniOgrenci2=new Ogrenci(387,"Erdem-1");
        System.out.println(Ogrenci.ogrSayisi);
        
        Ogrenci yeniOgrenci3=new Ogrenci(385,"Erdem-2");
        System.out.println(Ogrenci.ogrSayisi);
        
        Ogrenci yeniOgrenci4=new Ogrenci(220,"Erdem-2");
        System.out.println(Ogrenci.ogrSayisi);
        
        Ogrenci.ogrSelamla();
        
        yeniOgrenci4.ogrSelamla2();
        
        sayHi();
    }
    
    public static void sayHi(){
        System.out.println("Hi!");
    }
    
}
