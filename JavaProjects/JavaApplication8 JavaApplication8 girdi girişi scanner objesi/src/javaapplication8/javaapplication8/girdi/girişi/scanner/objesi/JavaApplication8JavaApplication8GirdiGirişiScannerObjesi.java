/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.javaapplication8.girdi.girişi.scanner.objesi;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication8JavaApplication8GirdiGirişiScannerObjesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lutfen notunuzu girin");
        
        Scanner s= new Scanner(System.in);
        int not=s.nextInt();
        int a=0;
        if(not <=100 && not >= 0){
            a=1;
        }
        
        
        while(a==0){
            System.out.println("lutfen uygun aralıkta deger girin.");  
            not=s.nextInt();
            if(not <=100 && not >= 0){
            a=1;
            }
        }
        
        
   
        if(a==1){
            
            if(not >= 90){
                System.out.println("harf notunuz erdem 1 numara");
            }
            
            else if(not < 90 && not >=80){
                System.out.println("harf notunuz erdem 2 numara");
            }
            
            else if(not < 80 && not >=65){
                System.out.println("harf notunuz erdem 3 numara");
            }
            
            else{
                System.out.println("notunuz erdem 4 numara");
            }
        }
        else{
            System.out.println("uygun aralıkta not girmediniz.");
        }
        
        
                
    }
    
}
