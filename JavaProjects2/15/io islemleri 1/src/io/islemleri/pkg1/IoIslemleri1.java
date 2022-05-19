/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.islemleri.pkg1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author erdem
 */
public class IoIslemleri1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileWriter writer =null;//en başa yazıyoruz ki finally de felan ulaşılabilsin
        
        try {
            writer=new FileWriter("output.txt");
            
            for(int i=0;i<10;i++){
                writer.write("i= "+i);
            }
            
        } catch (IOException e) {
            e.getMessage();
        }finally{
            
            try {
                writer.close();
            } catch (IOException e) {
                e.getMessage();
            }
            
        }
        
        
        
        
    }
    
    
    
}
