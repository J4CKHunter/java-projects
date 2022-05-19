/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31.polymorphism1;

/**
 *
 * @author J4
 */
public class Dikdortgen extends GeometrikSekil{
    private double en;
    private double boy;

    public Dikdortgen() {
        this.en=0;
        this.boy=0;
    }

    
    public Dikdortgen(double en, double boy) {
        setEn(en);
        setBoy(boy);
    }

    
    
    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        if(en<0)
            this.en=0;
        else
            this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        if(boy<0)
            this.boy = 0;
        else
            this.boy = boy;
    }
    
    public double AlanBul(){
        return en*boy;
    }
    
}
