/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.ebob;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9Ebob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("birinci sayiyi girin");
        int sayi_1=s.nextInt();
        System.out.println("ikinci sayiyi girin");
        int sayi_2=s.nextInt();
        int j;
        int ebob=1;
        
        
        
        if(sayi_1>sayi_2){
            j=sayi_2;
        }
        else if(sayi_2>sayi_1){
            j=sayi_1;
        }
        else{
            ebob=sayi_1;
            j=0;
        }
        
        for(int i=2;i<=j;i++){
            if(sayi_1%i==0 && sayi_2%i==0){
                ebob=i;
            }
        }
        System.out.println("ebob: "+ebob);
        System.out.println("ekok: "+(sayi_1*sayi_2)/ebob);
        
        
        int ekok=(sayi_1*sayi_2)/ebob;
        int k=1;
        int katlar=ekok;
        while (katlar<=100){
            System.out.println(""+katlar);
            k++;
            katlar=ekok*k;
            
        }
    }
    
}
