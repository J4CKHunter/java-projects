/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.fibonacci;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("kacinci siraya kadar fibonacci acalim:");
        Scanner s=new Scanner(System.in);
        int sira=s.nextInt();
        int dizi[]=new int[sira];
        
        dizi[0]=0;
        dizi[1]=1;
        
        
        for(int i=2;i<sira;i++){
            dizi[i]=dizi[i-1]+dizi[i-2];
        }
        for(int j=0;j<sira;j++){
            System.out.println(""+dizi[j]);
        }
        
    }
    
}
/*1 2 3 4 5 6 7 8  9 
  0 1 1 2 3 5 8 13 21
*/
