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
public class Kare implements Karsilastir{
    private double KenarUzunlugu;

    public Kare() {
        KenarUzunlugu=0;
    }

    public Kare(double KenarUzunlugu) {
        setKenarUzunlugu(KenarUzunlugu);
    }

    public double getKenarUzunlugu() {
        return KenarUzunlugu;
    }

    public void setKenarUzunlugu(double KenarUzunlugu) {
        this.KenarUzunlugu = KenarUzunlugu;
    }
    
    public double alanHesapla(){
        return KenarUzunlugu*KenarUzunlugu;
    }

    @Override
    public String karsilastir(Object object) {
        Kare k=(Kare)object;
        if(this.alanHesapla()>k.alanHesapla())
            return "asil kare alanı parametredekinden büyük";
        else if(this.alanHesapla()<k.alanHesapla())
            return "parametredeki asıl kare alanından daha büyük";
        
        else 
            return "ikisinin alani esittir";
    }
    
    
    
    
}
