/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.inner.class1;


public class AlanlaraErisim {
    
    private String[] cercevedekiString={"a","b","c"};
    
    public static void main(String[] args) {
        AlanlaraErisim.StringDiziYaz stringYazici=new AlanlaraErisim().new StringDiziYaz();
        AlanlaraErisim.IntDiziYaz intYazici=new AlanlaraErisim().new IntDiziYaz();
        
        String[] bilgi={"Erdem","Nayin","180202050"};
        int[] numaraDizisi={1,5,9,7,5,3,1,0,5};
        
        stringYazici.stringYaz(bilgi);
        intYazici.intYaz(numaraDizisi);
        
    }
    
    private class StringDiziYaz{
        protected void stringYaz(String[] array){
            
            System.out.println(cercevedekiString.length);
            
            for (String string : array) {
                System.out.println(string+" ");
            }
        }
    }
    
    protected class IntDiziYaz{
    
        private void intYaz(int[] array){
            
            for (String string : cercevedekiString) {
                System.out.print(string+" ");
            }
            System.out.println("");
            for (int i : array) {
                System.out.print(i+" ");
            }
        }
    
    }
}
