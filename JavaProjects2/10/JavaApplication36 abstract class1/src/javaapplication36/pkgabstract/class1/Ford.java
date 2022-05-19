/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36.pkgabstract.class1;

/**
 *
 * @author J4
 */
public class Ford extends Araba{
    private double jantBoyutu;

    public double getJantBoyutu() {
        return jantBoyutu;
    }

    public void setJantBoyutu(double jantBoyutu) {
        this.jantBoyutu = jantBoyutu;
    }

    @Override
    public double benzinKulllanimi() {
        return getAgirlik()/100;
    }
    
}
