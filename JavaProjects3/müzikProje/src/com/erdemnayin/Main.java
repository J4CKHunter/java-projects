package com.erdemnayin;

import com.erdemnayin.model.DataSource;
import com.erdemnayin.model.Sarkici;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        dataSource.openDatabase();


        /*ArrayList<Sarkici> tümSarkicilar = dataSource.tümSarkicilariGetir();

        if(tümSarkicilar == null){
            System.out.println("Sarkici yok!");
        }
        else{
            for (Sarkici temp:tümSarkicilar) {
                System.out.println("ID: " + temp.getSarkiciID() + "  Sarkici Adi: " +temp.getSarkiciAdi());
            }
        }*/

        /*ArrayList<Sarkici> tümSarkicilarSirali = dataSource.tümSarkicilariSiraliGetir(dataSource.SIRALA_AZALAN);
        for (Sarkici temp:tümSarkicilarSirali) {
            System.out.println("ID: " + temp.getSarkiciID() + "  Sarkici Adi: " +temp.getSarkiciAdi());
        }*/

        /*ArrayList<String> sarkilarVeAlbumleri = dataSource.albumlerdekiSarkilar();
        for (String temp:sarkilarVeAlbumleri) {
            System.out.println(temp);
        }*/

        /*ArrayList<String> sarkilarVeSarkicilar = dataSource.sarkicilarinSarkilari() ;
        for (String temp:sarkilarVeSarkicilar) {
            System.out.println(temp);
        }*/

        //dataSource.sarkiciAdiGuncelle(1,"Yıldız Tilbe");

        /*ArrayList<String> sarkilar = dataSource.sarkicininSarkilari("Sezen Aksu");
        for (String temp:sarkilar) {
            System.out.println(temp);
        }*/


        dataSource.closeDatabase();
    }
}
