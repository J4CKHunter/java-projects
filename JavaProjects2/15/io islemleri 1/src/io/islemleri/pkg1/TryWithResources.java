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
public class TryWithResources{
    
    public static void main(String[] args) throws IOException {

        try(FileWriter writer=new FileWriter("twr-output.txt");
            FileWriter writer2=new FileWriter("twr-cikti.txt")
            ){
                
                for(int i=15;i>0;i--){
                    writer.write("degisken= "+i+"\n");
                    writer2.write("degisken= "+i*5+"\n");
                }
                

            }
        
    }
   
}
