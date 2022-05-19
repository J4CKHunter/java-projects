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
public class io_islemleri_2 {
    public static void main(String[] args) throws IOException {
        
        FileWriter writer=null;
        
        try{
            writer=new FileWriter("cikti.txt");
            
            for(int i=0;i<15;i++){
                writer.write("i="+i+" ");
            }
        }finally{
        
           writer.close();
        
        }
    }
        
}