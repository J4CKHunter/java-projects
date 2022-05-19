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
public class personel {
    
    private int yas;

    public personel() {
    }

    public personel(int yas) {
        setYas(yas);
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        
        if(yas < 0){
            IllegalArgumentException e=new IllegalArgumentException("Sıfırdan kucuk deger girildi.");
            throw e;
        }
        
        else
        {
            this.yas=yas;
            System.out.println("Yas:"+yas);
        }
    }
    
    
}
