
import java.util.Scanner;
class Library {
String book1 = null;
String book2 = null;
String book3 = null;

public void addBook(String bookName) {
if (book1 == null) {
book1 = bookName;
} else if (book2 == null) {
book2 = bookName;
} else if (book3 == null) {
book3 = bookName;
} else {
System.out.println("Storage Full");
return;
}
System.out.println("\"" + bookName + "\" added");
}

public void issueBook(String bookName) {
if (bookName.equals(book1)) {
book1 = null;
} else if (bookName.equals(book2)) {
book2 = null;
} else if (bookName.equals(book3)) {
book3 = null;
} else {
System.out.println("Book not found");
return;
}
System.out.println("\"" + bookName + "\" issued");
}

public void removeBook(String bookName) {
if (bookName.equals(book1)) {
book1 = null;
} else if (bookName.equals(book2)) {
book2 = null;
} else if (bookName.equals(book3)) {
book3 = null;
} else {
System.out.println("Book not found");
return;
}
System.out.println("\"" + bookName + "\" removed");
}

public void displayBooks() {
System.out.println("Books in Library:");
if (book1 != null) System.out.println("- " + book1);
if (book2 != null) System.out.println("- " + book2);
if (book3 != null) System.out.println("- " + book3);
if (book1 == null && book2 == null && book3 == null)
System.out.println("No books available.");
}
}

public class Lib {
public static void main(String[] args) {
Library lib = new Library();
Scanner sc = new Scanner(System.in);
int choice;
String name;

do {
System.out.println("\n1. Add Book");
System.out.println("2. Issue Book");
System.out.println("3. Remove Book");
System.out.println("4. Display Books");
System.out.println("5. Quit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();

switch (choice) {
case 1:
System.out.print("Enter Book Name to add: ");
name = sc.nextLine();
lib.addBook(name);
break;
case 2:
System.out.print("Enter Book Name to issue: ");
name = sc.nextLine();
lib.issueBook(name);
break;
case 3:
System.out.print("Enter Book Name to remove: ");
name = sc.nextLine();
lib.removeBook(name);
break;
case 4:
lib.displayBooks();
break;
case 5:
System.out.println("Exiting!");
break;
default:
System.out.println("Invalid Choice");
}
} while (choice != 5);
sc.close();
}
}








