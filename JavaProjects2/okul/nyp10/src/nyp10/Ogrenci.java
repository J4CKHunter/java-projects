/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyp10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author erdem
 */
public class Ogrenci {
    private String ad;
    private String soyad;
    private String ogrenciNo;
    public Ders[] dersler=new Ders[6];

    public Ogrenci() {
        this.ad = "girilmedi";
        this.soyad = "girilmedi";
        this.ogrenciNo = "girilmedi";
    }

    
    public Ogrenci(String ad, String soyad, String ogrenciNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.ogrenciNo = ogrenciNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void dersEkle(int index){
        dersler[index]=new Ders();
    }
    public double ortalamaHesapla(){
        double toplam=0;
        for(int i=0;i<6;i++){
            toplam=toplam+dersler[i].getNot();
        }
        return toplam/6;
    }
    public void ortalamaGoster(){
        System.out.println(getAd()+" "+getSoyad()+" "+"adli ogrencinin"+ " ortalamasi: "+ortalamaHesapla());
}
    
    public void dersListele(){
        System.out.println(ad+" "+soyad+" adli ogrencinin aldigi dersler:");
        for(int i=0;i<6;i++){
            System.out.println(dersler[i].getAd());
        }
    }
    
    public String ogr_no_degistir(String data,String newNum){
        
        String replaceAll = data.replaceAll(getOgrenciNo(),newNum);
        setOgrenciNo(newNum);
        System.out.println(getAd()+" "+getSoyad()+" "
                +"adli ogrencinin yeni numarasi: "+getOgrenciNo());
        return replaceAll;
        
    }
    
    public String ogr_no_degistir(String data) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Yeni numarayi giriniz:");
        String newNum=br.readLine();
        String replaceAll = data.replaceAll(getOgrenciNo(),newNum);
        setOgrenciNo(newNum);
        System.out.println(getAd()+" "+getSoyad()+" "
                +"adli ogrencinin yeni numarasi: "+getOgrenciNo());
        return replaceAll;
    }
}
