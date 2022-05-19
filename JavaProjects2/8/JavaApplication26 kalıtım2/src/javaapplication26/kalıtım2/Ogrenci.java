/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26.kalıtım2;

import static javaapplication26.kalıtım2.Personel.personelSayisi;

/**
 *
 * @author J4
 */
public class Ogrenci {
    private String isim;
    private String soyisim;
    private int yas;
    private int ogrenciNo;
    public static int ogrenciSayisi;

    public Ogrenci() {
        isim="henüz girilemdi";
        soyisim="henüz girilemdi";
        yas=0;
        ogrenciNo=0;
        ogrenciSayisi++;
    }

    
    public Ogrenci(String isim, String soyisim, int yas, int ogrenciNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
        ogrenciSayisi++;
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

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if(ogrenciNo<0)
            this.ogrenciNo=0;
        else    
            this.ogrenciNo = ogrenciNo;
    }
    
    public String getKimlikBilgisi(){
        
        return "Kimlik Bilgileri\nİsim:"+isim+"\nSoyisim:"+soyisim+"\nYas:"+yas+"\nOgrenci No:"+ogrenciNo;
    }

    @Override
    public String toString() {
        return "Kimlik Bilgileri(toString)\nİsim:"+isim+"\nSoyisim:"+soyisim+"\nYas:"+yas+"\nOgrenci No:"+ogrenciNo;
    }
    
}
