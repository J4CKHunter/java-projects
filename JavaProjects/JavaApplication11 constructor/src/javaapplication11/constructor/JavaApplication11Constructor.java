/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11.constructor;

class insan{
    
    int boy;
    int kilo;
    int yas;
    
    public insan(){ 
    // CONSTRUCTOR CLASS İLE AYNI İSME SAHİPTİR VE RETURN TYPE YOKTUR.
    // MAİNDE BU CLASSTAN BİR ŞEY OLUŞTURULMASINI SAĞLAYAN FONKSİYONDUR.            
        System.out.println("yeni bir insan objesi olusturuldu.");
        
        yas=1;
        // Constructor diğer bir özelliği initalize etmek.
        // default olarak başlangıc değeri atamak.
    }
    
    public insan(int boy,int kilo,int yas){
        this();         // burası için de default constructoru çalıştır demek.  this bu obje demek.
        this.boy=boy;   // parametreden gelen boyu,kiloyu,yasi;gerçekten var olan objenin classının içindeki boyuna geçirdik.
        this.kilo=kilo;
        this.yas=yas;
    }
}

public class JavaApplication11Constructor {

    // BİR JAVA DOSYASIYLA PUBLİC CLASS İSMİ AYNI OLMALI.
    // PUBLİC OLMADIGI SURECE İSTEDĞİMİZ KADAR CLASS OLUŞTURABİLİRİZ.
    
    public static void main(String[] args) {
        
        insan veli; //BURADA İNSAN TİPİNDE VELİ Yİ POİNT EDİYOR.
                    // YERİNİ TUTUYOR.İÇİ BOŞ. int i; gibi. BİR DEĞERİ YOK.
        insan erdem=new insan(); // DEFAULT CONSTRUCTOR.parametre gönderilmeyen.
        
        //BURADA İNSAN TİPİNDE ALİ TANIMLANIYOR VE İNSAN CLASSININ ÖZELLİKLERİNİ 
        //İÇİNDE BARINDIRIYOR.
        
        erdem.boy=170;
        erdem.yas=20;
        erdem.kilo=74;
        System.out.println("Erdem boy:"+erdem.boy+"\nErdem yas:"+erdem.yas+"\nErdem kilo:"+erdem.kilo);
        
        insan kerem=new insan();
        System.out.println("Kerem yas:"+kerem.yas);
        
        insan samet=new insan(190,65,21);
        System.out.println("Samet boy:"+samet.boy+"\nSamet yas:"+samet.yas+"\nSamet kilo:"+samet.kilo);
        
        
    }
    
}
/* mesela bir classta int yas; var.classın içinde bir constructor var ve değişken
    public insan(int yas){

    }
şeklinde tanımlı.javada son tanımlanan geçerlidir diye bir kural var.en son hangisi
tanımlandıysa onu kullanır.dolayısıyla constructorun içindeki yas classtaki yastan farklıdır.
constructorun içinde const.fonk.ta verilen yas kullanılır.
constructordan çıkınca ise normal insan classındaki yas kullanılır.
*/

/*  constructor her objenin ilk üretildiği anda çalıştırılan fonksiyonlardır.
    obje üretmek için new kelimesiyle beraber constructor çagırılması gerekir.
    obje üretilmiş olur ve mainde object referer denen objeyi gösteren değişkene atamamız gerekir.
    yani new insan(); diyince obje oluşturulur.fakat hiçbir yerde kullanılmadıgı için
    java tarafından çöp olarak görülür ve daha sonda garbagecollector tarafından toplanır.
    garbagecollector için => System.gc();
*/ 
