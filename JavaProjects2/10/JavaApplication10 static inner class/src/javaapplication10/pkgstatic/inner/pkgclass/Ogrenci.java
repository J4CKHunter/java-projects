/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.pkgstatic.inner.pkgclass;

/**
 *
 * @author erdem
 */
public class Ogrenci {
    private int ogrNo;
    private String ogrAdi;
    public static int ogrSayisi=0;

    public Ogrenci(int ogrNo, String ogrAdi) {
        this.ogrNo = ogrNo;
        this.ogrAdi = ogrAdi;
        ogrSayisi++;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getOgrAdi() {
        return ogrAdi;
    }

    public void setOgrAdi(String ogrAdi) {
        this.ogrAdi = ogrAdi;
    }

    public static int getOgrSayisi() {
        return ogrSayisi;
    }

    public static void setOgrSayisi(int ogrSayisi) {
        Ogrenci.ogrSayisi = ogrSayisi;
    }
    
    public static void ogrSelamla(){
        System.out.println("Merhaba ogrenci!");
    } 
    public void ogrSelamla2(){
        System.out.println("Merhaba "+getOgrAdi());
    }
}
