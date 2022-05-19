/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.siralama;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9Siralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("lutfen sayilari giriniz.cikmak icin -1");
        
        Scanner s= new Scanner(System.in);
        int giris=0;
        int sayac=0;
        
        int dizi[]=new int[100];
        
        while(giris!=-1){
            
           giris= s.nextInt();
           dizi[sayac]=giris;
           sayac++;
        }
        System.out.println("Sayilarin siralanmis hali:");
        int temp;
        for(int i=1;i<sayac-1;i++){
            for(int j=0;j<sayac-2;j++){
            
                if(dizi[j]>=dizi[j+1]){
                    temp=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=temp;
                }
            
            
            }
        }

            
        for(int k=0;k<sayac-1;k++){
            System.out.println(""+dizi[k]);
        }





}
}

