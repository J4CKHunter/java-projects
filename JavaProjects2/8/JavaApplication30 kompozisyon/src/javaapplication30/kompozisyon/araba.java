/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30.kompozisyon;

/**
 *
 * @author J4
 */
public class araba {
    
    motor motor=new motor();
    
    public void hareketeGec(){
        motor.startMotor();
        System.out.println("Araba harekete geçti.");
    }
    
    public void hareketiDurdur(){
        System.out.println("Araba yavaşladı ve durdu.");
        motor.stopMotor();
    }
}
