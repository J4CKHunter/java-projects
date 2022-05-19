/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.methods_1;

/**
 *
 * @author J4
 */
public class JavaApplication10Methods_1 {

    /**
     * @param args the command line arguments
     */
    
    static int f(int x){
        return x*10+10;
    }
    
    static float g(int x){
        return (float)x/5;
    }
    
    static int h(int x){
        return f(x)+(int)g(x)*2+3;
    }
    
    static int j(int x){
        return 5*x+75;
    }
    public static void main(String[] args) {
        
        System.out.println(f(5));
        System.out.println(g(71));
        System.out.println(h(7));
        System.out.println(f(j(6)));
    }
    
}
