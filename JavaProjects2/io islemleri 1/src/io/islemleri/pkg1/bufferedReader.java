/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.islemleri.pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erdem
 */
public class bufferedReader {
    public static void main(String[] args) {
        Scanner s=null;
        ArrayList <String> list=new ArrayList<String>();
        
        try {
            s=new Scanner(new BufferedReader(new FileReader("hikaye2.txt")));
            
            while(s.hasNextLine()){
                list.add(s.nextLine());
            }
        } catch (IOException e) {
            e.getMessage();
        }finally{
            s.close();
        }
        
        for(int i=0;i<list.size();i++){
        
            System.out.println(i+" "+list.get(i));
        }
        
    }
}
