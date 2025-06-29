package jdbcapp;
import java.sql.*;

public class DisplayStudent {
public static void main(String[] args) {
try {
Connection conn = ConnectDB.connect();
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
while (rs.next()) {
System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2));
}
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
