/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author erdem
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a=new C();
        a.f("foo");
        
        C c=new C();
        c.f("foo");
        
        
        
        B b=new D();
        b.f("foo");
        
        
        D d=new D();
        d.f("foo");
    }
    
}
