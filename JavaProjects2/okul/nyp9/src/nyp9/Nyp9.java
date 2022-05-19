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
public class Nyp9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alfaRobot alfaRobot=new alfaRobot();
        betaRobot betaRobot=new betaRobot();
        gamaRobot gamaRobot=new gamaRobot();
        
        System.out.println("alfaRobot boyu: "+alfaRobot.getBoy_cm()+"cm");
        System.out.println("betaRobot boyu: "+betaRobot.getBoy_cm()+"cm");
        System.out.println("gamaRobot boyu: "+gamaRobot.getBoy_cm()+"cm\n");
        
        alfaRobot.bina_yap();
        betaRobot.agac_dik();
        
        gamaRobot.calis();
        
        gamaRobot.gorev_degistir();
        gamaRobot.calis();
        
        gamaRobot.gorev_degistir();
        gamaRobot.calis();
    }
    
}
