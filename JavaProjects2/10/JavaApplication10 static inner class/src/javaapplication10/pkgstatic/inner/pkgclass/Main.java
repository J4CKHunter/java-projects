/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.pkgstatic.inner.pkgclass;

/**
 *
 * @author erdem
 */
public class Main {
    
    public class stringiYazdir{
        
        public void stringiYaz(String[] array){
            for (String string : array) {
                System.out.println(string+"");
            }
        }
    
    }
    
    public static class StaticDiziYaz{
    
        public void stringiBastir(String[] array){
            for (String string : array) {
                System.out.println(string+"");
            }
        }
    
    }
    
    public static class StaticDiziStaticYaz{
    
        public static void staticStringBAAS(String[] array){
            for (String string : array) {
                System.out.println(string+"");
            }
        }
    
    }
    
    public static void main(String[] args) {
       
       String[] dizi={"123","abc"};
        
       Main.stringiYazdir nesne2=new Main().new stringiYazdir();
       nesne2.stringiYaz(dizi);
       System.out.println("");
        
       StaticDiziYaz nesne=new StaticDiziYaz();
       nesne.stringiBastir(dizi);
       System.out.println("");
        
       StaticDiziStaticYaz.staticStringBAAS(dizi);
       
        
    }
}
