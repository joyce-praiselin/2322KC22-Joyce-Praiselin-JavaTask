import java.util.Scanner;
class Bank {
int balance ;
Bank(int bl) {
balance = bl;
}

synchronized void withdraw(String name, int amount) {
System.out.println(name + " trying to withdraw " + amount);
if (balance >= amount) {
try {
Thread.sleep(1000);
} 
catch (Exception e) {
System.out.println("Error");
}
balance -= amount;
System.out.println(name + " success. Balance left: " + balance);
} else {
System.out.println(name + " failed. Not enough balance: " + balance);
}
}
}
class User extends Thread {
Bank bank;
String name;
int amount;
User(Bank bank, String name, int amount) {
this.bank = bank;
this.name = name;
this.amount = amount;
}
public void run() {
bank.withdraw(name, amount);
}
}
public class BankThread {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter balance: ");
int balance = sc.nextInt();


Bank b = new Bank(balance);
User u1 = new User(b, "User1", 500);
User u2 = new User(b, "User2", 400);
User u3 = new User(b, "User3", 300);
u1.start();
u2.start();
u3.start();
}
}
