/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5.oparators1;

/**
 *
 * @author J4
 */
public class JavaApplication5Oparators1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=10,b=20,c=30;
        
        System.out.println("sonuc 1 = " + a+b );
        System.out.println("sonuc 2 = " + (a+b) );
        System.out.println("sonuc 3 = " + (a-b) );
        System.out.println("sonuc 4 = " + (a*b) );
        System.out.println("sonuc 5 = " + a/b );
        System.out.println("sonuc 6 = " + (float)(a/b) );
        System.out.println("sonuc 7 = " + (float)((float)a/(float)b ) );
        
        // **** ikilik tabanda işlemler ****
        
        System.out.println("sonuc 8 = " + (10>>2) );
        /* ikilik tabanda yazılır 
            10 = 8+2
            10 ikilik tabanda 1010 şeklinde yazılır.
        ve 2 kez sağa kaydırılır.
            ilk önce 0101
             sonra   0010 olur ve bunun karşılığı 2'dir. 2 bastırılır.
        */
        
        System.out.println("sonuc 9 = " + (10<<2) );
        /* ikilik tabanda yazılır 
            10 = 8+2
            10 ikilik tabanda 1010 şeklinde yazılır.
        ve 2 kez sola kaydırılır.
            ilk önce 10100
             sonra   101000 olur ve bunun karşılığı 32+8=40'tır. 40 bastırılır.
        */
        
        System.out.println("sonuc 10 = " + (10>>>2));
        /* >>'den tek farkı işaretsiz (unsigned) olması.
        
        */
        
        System.out.println("sonuc 10 = " + (a<b) );        
        System.out.println("sonuc 10 = " + (a>b) );
        System.out.println("sonuc 10 = " + (a==b) );
        System.out.println("sonuc 10 = " + (a!=b) );
         
        
        
        
        
        
        
    }
    
}
