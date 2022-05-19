/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40.interface1;

/**
 *
 * @author J4
 */
public class JavaApplication40Interface1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kare kare=new Kare(4);
        Kare kare2=new Kare(7);
        
        System.out.println("Kare alan karsilastirmasi:"+kare.karsilastir(kare2));
    
        Personel p1=new Personel(30);
        Personel p2=new Personel(20);
        System.out.println("\nYas karsilastirmasi:"+p1.karsilastir(p2)+"\n");
        
        nesneKarsilastir(p2,p1);
        nesneKarsilastir(kare2,kare);
    }
    
    public static void nesneKarsilastir(Karsilastir obje1,Karsilastir obje2){
        System.out.println("Karsilastirma:"+obje1.karsilastir(obje2)+"\n");
    }
    
}
