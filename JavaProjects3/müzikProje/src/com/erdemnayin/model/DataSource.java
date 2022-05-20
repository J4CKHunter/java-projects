package com.erdemnayin.model;


import java.sql.*;
import java.util.ArrayList;

public class DataSource {

    public static final String DB_NAME = "müzik.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;

    public static final String TABLO_ALBUM = "album";
    public static final String SUTUN_ALBUM_ID = "albumID";
    public static final String SUTUN_ALBUM_ADI = "albumAdi";
    public static final String SUTUN_ALBUM_SARKICI_ID = "sarkiciID";

    public static final String TABLO_SARKI = "sarki";
    public static final String SUTUN_SARKI_ID = "sarkiID";
    public static final String SUTUN_SARKI_ADI = "sarkiAdi";
    public static final String SUTUN_SARKİ_ALBUM_ID = "albumID";

    public static final String TABLO_SARKICI = "sarkici";
    public static final String SUTUN_SARKICI_ID = "sarkiciID";
    public static final String SUTUN_SARKICI_ADI = "sarkiciAdi";

    public static final int SIRALA_ARTAN = 1;
    public static final int SIRALA_AZALAN = 0;

    private Connection connection;

    public boolean openDatabase(){
        try{
            connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public void closeDatabase(){
        try {
            if(connection != null)
                connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Sarkici> tümSarkicilariGetir(){

        ArrayList<Sarkici> tümSarkicilar = new ArrayList<>();

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from " + TABLO_SARKICI)){

            while(resultSet.next()){
                Sarkici sarkici = new Sarkici();
                sarkici.setSarkiciID(resultSet.getInt(SUTUN_SARKICI_ID));
                sarkici.setSarkiciAdi(resultSet.getString(SUTUN_SARKICI_ADI));

                tümSarkicilar.add(sarkici);
            }
            return tümSarkicilar;

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Sarkici> tümSarkicilariSiraliGetir(int x){

        StringBuilder stringBuilder = new StringBuilder("select * from " + TABLO_SARKICI + " order by "+SUTUN_SARKICI_ADI);
        ArrayList<Sarkici> tümSarkicilarSirali = new ArrayList<>();

        if(x == SIRALA_ARTAN){
            stringBuilder.append(" asc");
        }
        else if(x == SIRALA_AZALAN){
            stringBuilder.append(" desc");
        }
        else{
            System.out.println("hatali siralama fonksiyonu girdisi");
            return  null;
        }

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(stringBuilder.toString())){

            while(resultSet.next()){
                Sarkici sarkici = new Sarkici();
                sarkici.setSarkiciID(resultSet.getInt(SUTUN_SARKICI_ID));
                sarkici.setSarkiciAdi(resultSet.getString(SUTUN_SARKICI_ADI));

                tümSarkicilarSirali.add(sarkici);
            }
            return tümSarkicilarSirali;

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<String> albumlerdekiSarkilar(){

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>();

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select albumAdi,sarkiAdi from album inner join sarki on sarki.albumID = album.albumID;")){

            while(resultSet.next()){
                stringBuilder.append(resultSet.getString(SUTUN_SARKI_ADI) + "----" + resultSet.getString(SUTUN_ALBUM_ADI));
                arrayList.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
            return arrayList;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<String> sarkicilarinSarkilari(){

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>();

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select sarkiAdi,sarkiciAdi from album inner join sarki \n" +
                    "on sarki.albumID = album.albumID inner join sarkici\n" +
                    "on sarkici.sarkiciID=album.sarkiciID;")){

            while(resultSet.next()){
                stringBuilder.append(resultSet.getString(SUTUN_SARKI_ADI) + "----" + resultSet.getString(SUTUN_SARKICI_ADI));
                arrayList.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
            return arrayList;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public void sarkiciAdiGuncelle(Integer ID , String yeniIsım){
        try(PreparedStatement preparedStatement = connection.prepareStatement("update "+ TABLO_SARKICI + " set sarkiciAdi = ? where " + SUTUN_SARKICI_ID + " = ?")){
            preparedStatement.setString(1,yeniIsım);
            preparedStatement.setString(2,ID.toString());

            preparedStatement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<String> sarkicininSarkilari(String sarkiciAdi){

        ArrayList<String> arrayList = new ArrayList<>();

        try(PreparedStatement preparedStatement = connection.prepareStatement("select sarkiAdi from sarki inner join album\n" +
                "on sarki.albumID=album.albumID inner join sarkici\n" +
                "on sarkici.sarkiciID=album.sarkiciID where sarkiciAdi= ?")){

            preparedStatement.setString(1,sarkiciAdi);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                arrayList.add(resultSet.getString(SUTUN_SARKI_ADI));
            }

            return arrayList;

        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
