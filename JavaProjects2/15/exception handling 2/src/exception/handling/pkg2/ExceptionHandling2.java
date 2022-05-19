/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling.pkg2;

/**
 *
 * @author erdem
 */
public class ExceptionHandling2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            personel p1=new personel(58);
            personel p2=new personel(-10);
            personel p3=new personel(18);
            
        } catch (IndexOutOfBoundsException e) {
            
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            
        } catch (IllegalArgumentException e1) {
          
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            
        } catch(Exception e2){
            
            System.out.println(e2.getMessage());
            System.out.println(e2.toString());
        
        }finally{
        
            personel p2=new personel(25);
            personel p3=new personel(9);
        
        }
    }
    
    
    
    
    
}
