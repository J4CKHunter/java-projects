/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.sayi.tahmini.v3;

/**
 *
 * @author J4
 */

import java.lang.Math;
import java.util.Scanner;

public class JavaApplication9SayiTahminiV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int number=(int)(Math.random()*(9999-1000)+1)+1000;
        int number_shadow=number;
        int face_values[]=new int[4];
        int prediction_face_values[]=new int[4];
        boolean condition=true;
        int i,j,k;
        
        System.out.println(""+number);
        //asil uretilen sayinin kaybolmamasi icin shadow'a atiyoruz
        //islemler shadow'lardan yapılacak        
        //uretilen random sayinin basamaklarına ayırıp diziye atıyoruz
        
        for(i=3;i>=0;i--){
            
            face_values[i]=number_shadow%10;
            number_shadow/=10;
        
        }
        //burada her bir basamakgı sirayla bir sonraki basamaklarla 
        //karsilastiriyoruz.esit varsa yeni sayi uretip diziye atiyor.
        //sonra while'a tekrar girerek yeni sayimizin uygunlugunu kontrol ediyor
        
        while(condition){
            
            condition=false;
            
            for(i=0;i<4;i++){
            
                for(j=i+1;j<4;j++){
                
                    if(face_values[i]==face_values[j]){
                        
                        condition=true;
                        number=(int)(Math.random()*(9999-1000)+1)+1000;
                        number_shadow=number;
                        System.out.println(""+number);
                        for(k=3;k>=0;k--){
            
                            face_values[k]=number_shadow%10;
                            number_shadow/=10;    
                        }
                        
                        break;
                        
                    }
                    
                }
                if(condition==true){
                    break;
                }
            }
        
        }
        System.out.println(""+number);
        int prediction;
        System.out.println("think of a 4 digit number !");
        prediction=s.nextInt();
        int prediction_shadow=prediction;
        //tahmin alip yine shadowuna atıyoruz.
        int counter;
        condition=true;
        while(condition){
            
            counter=0;
            //tahmini basamaklarina ayirip diziye atiyoruz
            for(i=3;i>=0;i--){
                prediction_face_values[i]=prediction_shadow%10;
                prediction_shadow/=10;
            }
            //tahminle uretilen sayimizi karsilastiriyoruz
            //ayni basamak degerinde ayni sayilar varsa counter artiyor
            for(j=0;j<4;j++){
                
                if(face_values[j]==prediction_face_values[j]){
                    System.out.println(""+face_values[j]+" ");
                    counter++;
                }
                
            }
            //counter 4 ise tum basamaklar tahminle esitse dogru bilmisiz 
            //demektir.yoksatam olarak bilememisizdir.yeni sayi tahmini istenir.
            if(counter!=4){
                System.out.println("guess another !");
                prediction=s.nextInt();
                prediction_shadow=prediction;
            }
            
            else{
                condition=false;
                System.out.println("congratz ! you guessed right !");
            }
        
        }
        
        
    }
    
}
