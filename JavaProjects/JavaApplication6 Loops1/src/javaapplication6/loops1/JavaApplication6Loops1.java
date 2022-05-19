/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6.loops1;

/**
 *
 * @author J4
 */
public class JavaApplication6Loops1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=0;i<10;i++){
            System.out.println("selam "+i);
        }
        
        int i=0;
        while(i<10){
            System.out.println("merhaba "+(i+10));
            i++;
        }
        System.out.println("i="+i);
        
        
        i=0;
        do{
            System.out.println("hellü"+ i*10);
            i++;
        }while(i<10);
        System.out.println("i="+i);
        
        i=10;
        do{
            System.out.println("hellü"+ i*10);
            i++;
        }while(i<10);
        System.out.println("i="+i);
        
        
        
    }
    
}
