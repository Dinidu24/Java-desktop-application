package classes;
import java.sql.*;
public class DbConnector {
    public static Connection getConnection() {
        try {
            // Load the database driver (e.g., for MySQL)
            Class.forName("com.mysql.jdbc.Driver");
            // Establish a connection to the database
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelManagementSystem", "root", "Lpde/14727");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
