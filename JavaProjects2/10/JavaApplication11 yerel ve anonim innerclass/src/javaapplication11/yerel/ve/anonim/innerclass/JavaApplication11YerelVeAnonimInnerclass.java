/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11.yerel.ve.anonim.innerclass;

/**
 *
 * @author erdem
 */
public class JavaApplication11YerelVeAnonimInnerclass {

    
    public static void main(String[] args) {
        
        String[] isimlerDizisi={"Erdem","Nayin"};
        
        class StringDiziYaz{
        
            void stringDiziYazdir(String[] array){
                for (String string : array) {
                    System.out.println(string);
                }
            }
        
        }
        
        StringDiziYaz nesne=new StringDiziYaz();
        nesne.stringDiziYazdir(isimlerDizisi);
        
    }
    
    
    /*public static void main(String[] args) {
        StringDiziYaz nesne=new StringDiziYaz();
        //HATA VERIR CUNKU ORADA TANIMLI DEGIL MAIN FONK İÇİNDE TANIMLI
    }*/
    
    public void main2(String[] args) {
        
           String[] isimlerDizisi={"Erdem","Nayin"};
           
           class StringDiziYaz2{
        
            void stringDiziYazdir2(String[] array){
                for (String string : array) {
                    System.out.println(string);
                }
            }
        
        }
           
           StringDiziYaz2 nesne2=new StringDiziYaz2();
           nesne2.stringDiziYazdir2(isimlerDizisi);
           
           //StringDiziYaz nesne=new StringDiziYaz();
           // üsttekine erişim yok.
    }
    
}
