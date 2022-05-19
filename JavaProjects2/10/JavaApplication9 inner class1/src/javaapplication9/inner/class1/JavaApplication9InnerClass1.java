/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.inner.class1;

/**
 *
 * @author erdem
 */
public class JavaApplication9InnerClass1 {

   
    public static void main(String[] args) {
        String[] dizi={"Erdem","Nayin","180202050"};
        JavaApplication9InnerClass1.printString nesne = new JavaApplication9InnerClass1().new printString();
        nesne.yazdirString(dizi);
    }
    
    public class printString{
        
            public void yazdirString(String[] array){
                for (String string : array) {
                    System.out.println(string+"");
                }
            }    
            
    }
}
    

