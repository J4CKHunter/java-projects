/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.string2;

/**
 *
 * @author J4
 */
public class JavaApplication3String2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s= "erdem nayin 180202050 2.ogretim";
        
        int ilk_bosluk= s.indexOf(" ");
        System.out.println("ilk boslugun yeri = " + ilk_bosluk);
        String ilk_kelime=s.substring(0,ilk_bosluk);
        System.out.println("ilk kelime = "+ilk_kelime);
        
        
        int son_bosluk = s.lastIndexOf(" ");
        System.out.println("son boslugun yeri = " + son_bosluk);
        String son_kelime = s.substring(son_bosluk);
        System.out.println("son kelime = "+son_kelime);
        
        System.out.println("stringin 3. elemani ile 18. elemani arasindakiler = " + s.substring(3, 18));
        System.out.println("stringin 10. elemani = "+s.charAt(10));
        
        
    }
    
}
