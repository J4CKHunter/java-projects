/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.sayitahminiv4;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author J4
 */

public class JavaApplication9Sayitahminiv4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int face_values[]=new int[4];
        int predict_face_values[]=new int[4];
        int i,j;
        for(i=0;i<4;i++){
            face_values[i]=(int)(Math.random()*(9-0)+1);
            System.out.println(""+face_values[i]);
        }
        
        int n=face_values[0];
        while(n==0){
            face_values[0]=(int)(Math.random()*(9-0)+1);
        }
       
       boolean condition=true;
       while(condition){
            
            condition=false;
            
            for(i=0;i<4;i++){
            
                for(j=i+1;j<4;j++){
                
                    if(face_values[i]==face_values[j]){
                        
                        condition=true;
                        face_values[i]=(int)(Math.random()*(9-0)+1);
                        System.out.println("uretildi"+face_values[i]);
                      
                        break;
                        
                    }
                    
                }
                if(condition==true){
                    break;
                }
            }
        
        }
        
        for(i=0;i<4;i++){
            System.out.println(""+face_values[i]);
        }
        
        int prediction;
        System.out.println("think of a 4 digit number !");
        prediction=s.nextInt();
        
        for(i=3;i>=0;i--){
            predict_face_values[i] = prediction % 10;
            prediction/=10;
        }
        
        int counter;
        condition=true;
        while(condition){
            counter=0;
            for(j=0;j<4;j++){
                
                if(face_values[j]==predict_face_values[j]){
                    System.out.println(""+face_values[j]+" ");
                    counter++;
                }
                
            }
            
            if(counter!=4){
                System.out.println("guess another !");
                prediction=s.nextInt();
                for(i=3;i>=0;i--){
                    predict_face_values[i] = prediction % 10;
                    prediction/=10;
                }
            }
            else{
                condition=false;
                System.out.println("congratz ! you guessed right !");
            }
              
        }
        
    }
    
}
