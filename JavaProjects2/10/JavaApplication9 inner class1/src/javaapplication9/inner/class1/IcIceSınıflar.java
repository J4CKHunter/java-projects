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
public class IcIceSınıflar {
    
    public static void main(String[] args) {
        
        IcIceSınıflar.printString.IntDiziYaz nesne= new IcIceSınıflar().new printString().new IntDiziYaz();
        int[] dizi={1,22,5,67,8};
        nesne.intYaz(dizi);
    }
    
    public class printString{
        
            public void yazdirString(String[] array){
                for (String string : array) {
                    System.out.println(string+"");
                }
            }
            
            
            protected class IntDiziYaz{
    
                private void intYaz(int[] array){
                    
                    String[] erdem={"Erdem"};
                    yazdirString(erdem);
                    System.out.println();
                    for (int i : array) {
                        System.out.print(i+" ");
                    }
                }
    
            }
            
    }
}
