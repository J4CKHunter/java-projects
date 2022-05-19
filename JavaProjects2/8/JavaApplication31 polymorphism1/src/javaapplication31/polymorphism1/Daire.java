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
public class Daire extends GeometrikSekil{
    
    private double yaricap;
    
    public Daire(){
        yaricap=0;
    }
    public Daire(double yaricap){
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        if(yaricap<0)
            this.yaricap=0;
        else
            this.yaricap = yaricap;
    }
    
    
    public double AlanBul(){
        return Math.PI*yaricap * yaricap;
    }
    
}
