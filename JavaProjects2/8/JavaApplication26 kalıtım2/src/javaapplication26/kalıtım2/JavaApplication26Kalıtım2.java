/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26.kalıtım2;

/**
 *
 * @author J4
 */
public class JavaApplication26Kalıtım2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personel erdem=new Personel("Erdem","Nayin",20);
        System.out.println(erdem.getKimlikBilgisi());
        System.out.println("Personel Sayisi:"+Personel.personelSayisi);
        
        System.out.println("\n");
        
        Ogrenci kerem=new Ogrenci("Kerem","Nayin",15,384);
        System.out.println(kerem.toString());
        System.out.println("Ogrenci Sayisi:"+Ogrenci.ogrenciSayisi);
    }
    
}
