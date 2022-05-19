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
public class Mercedes extends Araba{
    private String modelYili;

    public String getModelYili() {
        return modelYili;
    }

    public void setModelYili(String modelYili) {
        this.modelYili = modelYili;
    }

    @Override
    public double benzinKulllanimi() {
        return getAgirlik()/100;
    }
    
}
