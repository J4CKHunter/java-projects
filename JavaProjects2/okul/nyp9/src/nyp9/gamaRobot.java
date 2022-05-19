/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyp9;

/**
 *
 * @author erdem
 */
public class gamaRobot implements alfaInterface,betaInterface{
    
    private final int boy_cm=200;
    public int i;
    
    public gamaRobot() {
        setI(0);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getBoy_cm() {
        return boy_cm;
    }
    
    public void calis(){
        if(getI()==0)
            agac_dik();
        else
            bina_yap();
    }
    
    public void gorev_degistir(){
        if(getI()==0)
            setI(1);
        else
            setI(0);
    }
    
    @Override
    public void bina_yap() {
        System.out.println("gamaRobot bina yaptı.");
    }

    @Override
    public void agac_dik() {
        System.out.println("gamaRobot agac dikti.");
    }

    
    
}
