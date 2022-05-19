/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28.kalıtım3;

/**
 *
 * @author J4
 */
public class personel {
    
    private String isim;
    private String soyisim;
    private int yas;
    
    public personel(){
        
        this.isim="henüz girilmedi";
        this.soyisim="henüz girilmedi";
        this.yas=0;
       
    }
    
    public personel(String isim,String soyisim,int yas){
        
        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;
    
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

    @Override
    public String toString() {
        return "isim=" + isim + ", soyisim=" + soyisim + ", yas=" + yas;
    }
    
}
