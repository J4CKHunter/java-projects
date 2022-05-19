/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.asal.bolen.bulma;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9AsalBolenBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("sayi girin:");
        Scanner s= new Scanner(System.in);
        int sayi=s.nextInt();
        int flag;
        for(int i=2;i<=sayi;i++){
           
          //bölüyor mu -> evet  
          if(sayi%i==0){
          // asal mı değil mi? bölen i sayisinin kontrolü yapılacak
          //2nin asal olduğu direkt tanimlandi.
            flag=0;
            if(i==2){
                System.out.println(""+2);
                continue;
            }
            
            //flag=1 bölündü,asal değil demek.
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            
            if(flag!=1){
                System.out.println(""+i);
            }
          }
        }
    }
    
}
