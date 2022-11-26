import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
       String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
       String username = "umut";
       String password = "0000";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);
            System.out.println("Connected");
            String sql  = "INSERT INTO useress(first_name,last_name,password)" + " VALUES ('Alas','Akiev','2222')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            connection.close();
        } catch (SQLException e) {
            System.out.println("Error in connection");
            throw new RuntimeException(e);

        }
    }
}