import java.io.*;
import java.util.*;

public class Fileemp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;
do {
System.out.println("\nEmployee Record System");
System.out.println("1. Add Employee");
System.out.println("2. View All Employees");
System.out.println("3. Update Employee");
System.out.println("4. Delete Employee");
System.out.println("5. Exit");
System.out.print("Enter Choice: ");
choice = sc.nextInt();
sc.nextLine();

switch (choice) {
case 1:
addemp(sc);
break;
case 2:
viewemp();
break;
case 3:
updateemp(sc);
break;
case 4:
deleteemp(sc);
break;
case 5:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice");
}
} whil
