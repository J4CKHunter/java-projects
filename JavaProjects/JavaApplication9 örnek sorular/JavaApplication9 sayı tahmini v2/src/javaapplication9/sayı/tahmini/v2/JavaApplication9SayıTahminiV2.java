/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.sayı.tahmini.v2;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9SayıTahminiV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("tahmin et");
        Scanner s=new Scanner(System.in);
        int sayi=(int)(Math.random()*(9999-1000)+1)+1000;
        int tahmin_sayisi=1;
        System.out.println(""+sayi);
        int tahmin=s.nextInt();
        
        int sayac;
        int tahmin_2;
        int sayi_2;

        while(tahmin!=sayi){
        
            while(tahmin>sayi){
                System.out.println("daha kucuk");
                tahmin_sayisi++;
                sayac=0;
                tahmin_2=tahmin;
                sayi_2=sayi;
                for(int i=0;i<4;i++){
                    
                    if(tahmin_2 %10 == sayi_2 % 10){
                        sayac++;
                    }
                    tahmin_2=tahmin_2/10;
                    sayi_2=sayi_2/10;
                }
                System.out.println(""+sayac+" tanesi eslesti");
                tahmin=s.nextInt();
            }
            while(tahmin<sayi){
                System.out.println("daha buyuk");
                tahmin_sayisi++;
                sayac=0;
                tahmin_2=tahmin;
                sayi_2=sayi;
                for(int j=0;j<4;j++){
                    
                    if(tahmin_2 %10 == sayi_2 % 10){
                        sayac++;
                    }
                    tahmin_2=tahmin_2/10;
                    sayi_2=sayi_2/10;
                }
                System.out.println(""+sayac+" tanesi eslesti");
                tahmin=s.nextInt();
            }
        }
        System.out.println("dogru tahmin! "+tahmin_sayisi+" kerede tahmin ettin");
    }
    
}
