/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.class1;

/**
 *
 * @author J4
 */
public class Araba {
    
    private int yil;
    private String renk;
    private String ad;
    private int hp;
    private boolean duz_mu;
    
    public void setYil(int yil){
        if(yil <=2019)
            this.yil=yil;
        else 
            System.out.println("Hatali yil girisi");
    }
    
    public int getYil(){
        return this.yil;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isDuz_mu() {
        return duz_mu;
    }

    public void setDuz_mu(boolean duz_mu) {
        this.duz_mu = duz_mu;
    }
    
    
    
}
