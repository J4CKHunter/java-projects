/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

/**
 *
 * @author erdem
 */
public class ExceptionHandling_2 {
    public static void main(String[] args) {
        int[] dizi = new int[3];
        
        dizi[0]=0;
        dizi[1]=1;
        dizi[2]=2;
        
        method1(dizi);
        System.out.println("Mainin sonu");
        
    }

    private static void method1(int[] dizi) {
        
        try {
            method2(dizi);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi alanin disindadir.");
        }
        System.out.println("method1 in sonu");
    }

    private static void method2(int[] dizi) {
        System.out.println("Sayi ="+dizi[0]);
        System.out.println("Sayi ="+dizi[1]);
        System.out.println("Sayi ="+dizi[2]);
        System.out.println("Sayi ="+dizi[3]);
        System.out.println("method2 nin sonu");
    }
}
