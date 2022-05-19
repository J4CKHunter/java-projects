/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40.interface1;

/**
 *
 * @author J4
 */
public class Personel implements Karsilastir{
    
    private int yas;

    public Personel() {
        yas=0;
    }

    public Personel(int yas) {
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String karsilastir(Object object) {
        Personel p=(Personel)object;
        if(this.yas>p.yas)
            return "fonksiyonu cagıran personel daha büyük";
        else if(this.yas<p.yas)
            return "parametredeki personel daha büyük";
        else
            return "eşit yaştalar";
    }
    
   
    
}
