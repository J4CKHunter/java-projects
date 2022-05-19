/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.asal.bölen.v2;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9AsalBölenV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("lutfen sayi girin");
        Scanner s=new Scanner(System.in);
        int sayi=s.nextInt();
        
        
        for(int i=2;i<sayi;i++){
            
            if(sayi>=(i*i)){
                if(sayi%i==0){
                    System.out.println(""+i);
                    sayi=sayi/i;
                }
                
            }
            else{
                System.out.println(""+sayi);
                break;
            }
        
        }
            
            
        }
    
    
    }
