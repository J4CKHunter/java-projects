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
public class Kare extends GeometrikSekil{
    
    private double kenar;

    public Kare() {
        this.kenar=0;
    }

    public Kare(double kenar) {
        setKenar(kenar);
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        if(kenar < 0 )
            this.kenar=0;
        else
            this.kenar = kenar;
    }
    public double AlanBul(){
        return kenar*kenar;
    }
}
