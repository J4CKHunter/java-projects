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
public class extensibility {
    public static void main(String[] args) {
        
        GeometrikSekil gs1=new GeometrikSekil();
        Kare k1=new Kare(7);
        Dikdortgen dd1=new Dikdortgen(8,14);
        GeometrikSekil gs2=new GeometrikSekil();
        Kare k2=new Kare(9);
        Dikdortgen dd2=new Dikdortgen(18,24);
        Daire d1=new Daire(3);
        Daire d2=new Daire(6);
        
        GeometrikSekil[] sekiller=new GeometrikSekil[8];
        sekiller[0]=gs1;
        sekiller[1]=k1;
        sekiller[2]=dd1;
        sekiller[3]=gs2;
        sekiller[4]=k2;
        sekiller[5]=dd2;
        sekiller[6]=d1;
        sekiller[7]=d2;
        
        alanlarihesapla(sekiller);
        
    }
    
    public static void alanlarihesapla(GeometrikSekil[] sekiller){
        
        for(GeometrikSekil geciciSekil:sekiller){
            System.out.println("Alan: "+geciciSekil.AlanBul());
        }
    }
}
