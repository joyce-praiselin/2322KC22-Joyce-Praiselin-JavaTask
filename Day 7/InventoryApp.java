package jdbcapp;
import java.sql.*;
import java.util.Scanner;

public class InventoryApp {
static final String URL = "jdbc:mysql://localhost:3306/inventorydb";
static final String USER = "root";
static final String PASS = "joyce_selin";

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

try {
Connection con = DriverManager.getConnection(URL, USER, PASS);
System.out.println("Connected to database.");
int choice;

do {
System.out.println("\n1. Add Product");
System.out.println("2. View All Products");
System.out.println("3. Search Product by Name");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();

switch (choice) {
case 1:
System.out.print("Enter product name: ");
String name = sc.nextLine();
System.out.print("Enter quantity: ");
int qty = sc.nextInt();
System.out.print("Enter price: ");
double price = sc.nextDouble();
PreparedStatement pst = con.prepareStatement("insert into products (name, quantity, price) VALUES (?, ?, ?)");
pst.setString(1, name);
pst.setInt(2, qty);
pst.setDouble(3, price);
pst.executeUpdate();
System.out.println("Product added.");
break;

case 2:
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from products");
while (rs.next()) {
System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Qty: " + rs.getInt("quantity") + ", Price: " + rs.getDouble("price"));
}
break;

case 3:
System.out.print("Enter name to search: ");
String search = sc.nextLine();
pst = con.prepareStatement("select * from products where name like ?");
pst.setString(1, "%" + search + "%");
rs = pst.executeQuery();
while (rs.next()) {
System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Qty: " + rs.getInt("quantity") + ", Price: " + rs.getDouble("price"));
}
break;

case 4:
System.out.println("Exiting...");
break;

default:
System.out.println("Invalid choice");
}
} while (choice != 4);

con.close();
} catch (Exception e) {
System.out.println("Error: " + e);
}

sc.close();
}
}
