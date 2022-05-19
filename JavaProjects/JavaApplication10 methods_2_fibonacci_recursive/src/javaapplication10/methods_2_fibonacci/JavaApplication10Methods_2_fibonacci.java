/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.methods_2_fibonacci;

/**
 *
 * @author J4
 */


import java.util.Scanner;

public class JavaApplication10Methods_2_fibonacci {

    /**
     * @param args the command line arguments
     */
    static int fib(int x){

    if(x==1)
        return 0;
    if(x==2)
        return 1;
    
    return fib(x-2)+fib(x-1);

}

    public static void main(String[] args) {
        
        System.out.println("kacinci fib sayisini istiyorsunuz:");
        Scanner s=new Scanner(System.in);
        System.out.println(fib(s.nextInt()));
    }
    
}
/*
        1 2 3 4 5 6 7 8  9 
        0 1 1 2 3 5 8 13 21
*/