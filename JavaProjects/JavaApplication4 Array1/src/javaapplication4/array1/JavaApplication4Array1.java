/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4.array1;

/**
 *
 * @author J4
 */
public class JavaApplication4Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dizi_1[] = new int[5];
        dizi_1[2]=8;
        
        String str_1[] ={"bir","otostopcunun","galaksi","rehberini","buldum"};
        
        System.out.println("" + dizi_1[0] + dizi_1[1] + dizi_1[2]);
        System.out.println(str_1[1] + str_1[3]);
        
        dizi_1[2]=3;
        str_1[2]="erdem";
        
        System.out.println(str_1[2]+ dizi_1[2]);
   
        
        
    }
    
}
