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
public class betaRobot implements betaInterface{
    
    private final int boy_cm=140;

    public int getBoy_cm() {
        return boy_cm;
    }

    @Override
    public void agac_dik() {
        System.out.println("betaRobot agac dikti.");
    }
}
