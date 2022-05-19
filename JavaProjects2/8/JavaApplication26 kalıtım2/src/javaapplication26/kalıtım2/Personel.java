/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26.kalıtım2;

/**
 *
 * @author J4
 */
public class Personel {
    private String isim;
    private String soyisim;
    private int yas;
    public static int personelSayisi;
    
    public Personel(){
        isim="henüz girilemdi";
        soyisim="henüz girilemdi";
        yas=0;
        personelSayisi++;
    }
    
    public Personel(String isim,String soyisim,int yas){
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;
        personelSayisi++;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<0)
            this.yas=0;
        else
            this.yas = yas;
    }
    
    public String getKimlikBilgisi(){
        
        return "Kimlik Bilgileri\nİsim:"+isim+"\nSoyisim:"+soyisim+"\nYas:"+yas;
    }

    @Override
    public String toString() {
        return "Kimlik Bilgileri(toString)\nİsim:"+isim+"\nSoyisim:"+soyisim+"\nYas:"+yas;
    }
    
    
    
    
}
