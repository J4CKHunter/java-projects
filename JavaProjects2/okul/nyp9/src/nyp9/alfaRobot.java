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
public class alfaRobot implements alfaInterface{
       
    private final int boy_cm=360;

    public int getBoy_cm() {
        return boy_cm;
    }
    
    
    @Override
    public void bina_yap() {
        System.out.println("alfaRobot bina yaptı.");
    }
    
}
