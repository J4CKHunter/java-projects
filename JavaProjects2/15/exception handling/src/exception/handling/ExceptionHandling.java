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
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] dizi=new int[2];
        
        try {
            dizi[0]=0;
            dizi[1]=1;
            dizi[2]=2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin sinirlari asildi.");
        }
        
        System.out.println(":)");
        
    }
    
}
