/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28.kalıtım3;

/**
 *
 * @author J4
 */
public class JavaApplication28Kalıtım3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personel p1=new personel("ahmet","sayar",35);
        System.out.println(p1.toString());
        
        ogrenci erdem=new ogrenci(180202050,"erdem","nayin",20);
        System.out.println(erdem.toString());
        
        personel yenip=new personel();
        System.out.println(yenip.toString());
        
        ogrenci yeniogr=new ogrenci();
        System.out.println(yeniogr.toString());
    }
    
}
