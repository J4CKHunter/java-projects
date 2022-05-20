import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            statement = connection.createStatement();
            statement.execute("create table personel(isimler text)");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
