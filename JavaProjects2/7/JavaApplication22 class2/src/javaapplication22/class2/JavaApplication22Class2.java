/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22.class2;

/**
 *
 * @author J4
 */
public class JavaApplication22Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dikdortgen d1=new dikdortgen();
        d1.boy=10;
        d1.en=8;
        
        System.out.println("alan d1:"+d1.alanHesap());
        
        dikdortgen d2=new dikdortgen();
        d2.boy=18;
        d2.en=(float)0.5;
        
        System.out.println("alan d2:"+d2.alanHesap());
        
        dikdortgen2 d3=new dikdortgen2();
        d3.setBoy(13.78);
        d3.setEn(2.13);
        System.out.println("d3'un eni:"+d3.getEn()+" d3'un boyu:"+d3.getBoy());
        System.out.println("d3'un alani:"+d3.alan_Hesapla());
        
        dikdortgen2 d4=new dikdortgen2();
        d4.setBoy(17);
        System.out.println("dikdortgen d4 constructor eni:"+d4.getEn()+" d4 boyu:"+d4.getBoy());
        System.out.println("d4'un alani:"+d4.alan_Hesapla());
        
        dikdortgen2 d5=new dikdortgen2(19,5);
        System.out.println("d5'in alani:"+d5.alan_Hesapla());
        
        dikdortgen2 d6=new dikdortgen2(8);
        System.out.println("d6 boyu:"+d6.getBoy());
    }
    
}
