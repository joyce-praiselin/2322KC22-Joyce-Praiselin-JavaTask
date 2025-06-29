package jdbcapp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter ID: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter Name: ");
String name = sc.nextLine();

try {
Connection conn = ConnectDB.connect();
PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?)");
ps.setInt(1, id);
ps.setString(2, name);
ps.executeUpdate();
System.out.println("Student Inserted");
conn.close();
} catch (Exception e) {
System.out.println(e);
}
}
}
