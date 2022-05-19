/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22.class2;

/**
 *
 * @author J4
 */
public class dikdortgen2 {
    
    private double en;
    private double boy;
    
    public dikdortgen2(){
    
        en=10;
    }
    
    public dikdortgen2(double en,double boy){
        this.en=en;
        this.boy=boy;
    }
    
    public dikdortgen2(double boy){
        this.boy=boy;
    }
    
    /*public dikdortgen2(double en){
        this.en=en;
    }*/

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        if (en>0)
            this.en = en;
        else
            System.out.println("hatali giris");
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        if(boy>0)
            this.boy = boy;
        else
            System.out.println("hatali giris");
    }
    
    public double alan_Hesapla(){
        return boy*en;
    }
}
