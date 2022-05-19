/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23.class3.pkgstatic.ve.pkgfinal;

/**
 *
 * @author J4
 */
public class CemberDaire {
    
    private double yaricap;
    private static int olusturulanNesneSayisi;
    private final double PI=3.14;
    
    public CemberDaire(){
        System.out.println("nesne olusturuluyor");
        olusturulanNesneSayisi++;
    }
    
    public static int getNesneSayisi(){
        return olusturulanNesneSayisi;
    }
    
    public void setYaricap(double yaricap){
        if(yaricap>0)
            this.yaricap=yaricap;
        else
            this.yaricap=1;
    }
    
    public double getYaricap(){
        return yaricap;
    }
    
    public double cevreHesap(){
        return 2*PI*yaricap;
    }
    
    public double alanHesap(){
        return PI*yaricap*yaricap;
    }
    
    
}
