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
public class ogrenci extends personel{
    
    private int ogr_no;

    public ogrenci() {
        super();
        /*
        setIsim("henüz girilmedi");
        setSoyisim("henüz girilmedi");
        setYas(0);
        */
        this.ogr_no=0;
    }

    public ogrenci(int ogr_no, String isim, String soyisim, int yas) {
        super(isim, soyisim, yas);
        /*
        setIsim(isim);
        setSoyisim(soyisim);
        setYas(yas);
        */
        this.ogr_no = ogr_no;
    }

    @Override
    public String toString() {
        return super.toString()+ ", ogr_no=" + ogr_no;
    }
}
