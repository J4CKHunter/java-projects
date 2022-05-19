/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.sayi.toplama;

import static java.lang.Character.isDigit;
import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9SayiToplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("istediğiniz kadar sayi girin\ncikmak icin -1 girin");
        Scanner s= new Scanner(System.in);
        int sayi = s.nextInt();
        int toplam=0,sayac=0;
        
        while(sayi!=-1){
        
            toplam=toplam+sayi;
            sayac++;
            sayi=s.nextInt();
        
        }
     
        System.out.println("sayilarin ortalamasi: "+ (float)((float)toplam/(float)sayac));
        
        
    }
    }
    

