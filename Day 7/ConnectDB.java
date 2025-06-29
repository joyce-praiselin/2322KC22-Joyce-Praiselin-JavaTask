package jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
public static Connection connect() {
Connection conn = null;
try {
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb", "root", "joyce_selin");
System.out.println("Connected");
} catch (SQLException e) {
System.out.println("Connection Failed: " + e);
}
return conn;
}
}
