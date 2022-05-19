/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.kendinden.önceki.asal.sayi.bulma;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9KendindenÖncekiAsalSayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("lutfen sayi girin");
        Scanner s= new Scanner(System.in);
        int sayi= s.nextInt();
        int flag=0;
        int asal=0;
        
        for(int i=sayi-1;i>1;i--){
            if(i==2){
                asal=2;
                break;
            }
            for(int k=2;k>i;k++){
            
               if(i%k==0){
                   break;
               }
               else flag=1;
            }
            if(flag==1){
                asal=i;
                break;
            }
            else asal=0;
        }
        System.out.println("girilen sayidan kucuk en büyük asal: "+asal);
    }
    
}
