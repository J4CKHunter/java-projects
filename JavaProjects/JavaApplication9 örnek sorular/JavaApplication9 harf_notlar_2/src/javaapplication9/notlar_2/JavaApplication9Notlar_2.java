/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.notlar_2;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9Notlar_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lutfen notunuzu giriniz:");
        Scanner s=new Scanner(System.in);
        int not = s.nextInt();
        
        if( not>100 || not<0 ){
           
            int temp;
            
            do{
                temp=1;
                System.out.println("Hatali giris!\n");
                System.out.println("Lutfen 0-100 arasında değer giriniz:");
                
                not=s.nextInt();
                
                if(not>100 || not<0){
                    temp=0;
                }
            }while(temp==0);
            
        }
        
        
        if(not>=85 ){
            System.out.println("notunuz:erdem 1");
        }
        
        else if(not>=70 ){
            System.out.println("notunuz:erdem 2");
        }
        
        else if(not>=65 ){
            System.out.println("notunuz:erdem 3");
        }
        
        else if(not>=50 ){
            System.out.println("notunuz:erdem 4");
        }
        
        else {
            System.out.println("notunuz:erdem 5");
        }
        
        
        
    }
    
}
