/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author erdem
 */
public class Seriler {
    
    public static int nToplam(int n){
    
        if(n==0)
            return 0;
        return n+nToplam(n-1);
    
    }
    
    public static int faktoriyel(int n){
    
        if(n==0 || n==1)
            return 1;
    
        return n*faktoriyel(n-1);
    
    }
    //1 1 2 3 5 8 13 21
    public static int fibonacci(int n){
        
        if(n==1 || n==2)
            return 1;
    
        return fibonacci(n-2)+fibonacci(n-1);
        
    }
    
}
