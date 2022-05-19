/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.fibonacci.döngüyle;

import java.util.Scanner;

/**
 *
 * @author J4
 */
public class JavaApplication9FibonacciDöngüyle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("lutfen hangi siradakini istiyorsaniz giriniz:");
        Scanner s=new Scanner(System.in);
        int sira=s.nextInt();
        
        int a=0;
        int b=1;
        int c=0;
        
        for(int i=0;i<sira-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        
        System.out.println(""+c);
        
    }
    
}
/*
        1 2 3 4 5 6 7 8
        0 1 1 2 3 5 8 13
        a b c
          a b c  
*/