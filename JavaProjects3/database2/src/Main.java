import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement statement = connection.createStatement()){

            connection.setAutoCommit(false);

            statement.execute("create table  if not exists Ogrenci(isim text)");
            statement.execute("delete from Ogrenci");
            statement.execute("insert into Ogrenci (isim) values ('Erdem Nayin') ");
            statement.execute("insert into Ogrenci (isim) values ('Kerem Nayin') ");

            ResultSet resultSet = statement.executeQuery("select * from Ogrenci");

            while(resultSet.next()){
                System.out.println("Ogrenci Adi: " + resultSet.getString(1));
            }
            System.out.println("--------------------------");



            statement.execute("update Ogrenci set isim = 'Bilal Nayin' where isim = 'Erdem Nayin' ");
            statement.execute("update Ogrenci set isim = 'Sebile Nayin' where isim = 'Kerem Nayin' ");

            resultSet = statement.executeQuery("select * from Ogrenci");

            while(resultSet.next()){
                System.out.println("Ogrenci Adi: " + resultSet.getString(1));
            }
            System.out.println("--------------------------");



            int etkilenenSatirSayisi = statement.executeUpdate("update Ogrenci set isim = 'Erdem Nayin' where isim = 'Sebile Nayin' ");
            System.out.println("etkilenenSatirSayisi = " + etkilenenSatirSayisi);
            System.out.println("--------------------------");



            resultSet = statement.executeQuery("select * from Ogrenci");

            while(resultSet.next()){
                System.out.println("Ogrenci Adi: " + resultSet.getString(1));
            }
            System.out.println("--------------------------");




            PreparedStatement preparedStatement = connection.prepareStatement("select * from Ogrenci where isim = ?");

            preparedStatement.setString(1,"Erdem Nayin");

            resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println("Ogrenci Adi: " + resultSet.getString(1));
            }
            System.out.println("--------------------------");




            preparedStatement.setString(1,"Bilal Nayin");

            resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println("Ogrenci Adi: " + resultSet.getString(1));
            }
            System.out.println("--------------------------");

            connection.commit();

            preparedStatement.close();
            resultSet.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
