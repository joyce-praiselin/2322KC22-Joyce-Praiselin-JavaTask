import java.util.Scanner;
class BankAcc{
int Account_num;
double balance;
BankAcc(int acc_num,double bal)
{
Account_num = acc_num;
balance = bal;

}
public void deposit(double amount)
{
balance += amount;
System.out.println("Cash deposited :" +amount);
System.out.println("Balance after deposit:"+balance);
} 
public void withdraw(double amount){
if(amount <= balance){
System.out.println("Cash Withdrawn ;" +amount);
balance = balance - amount;
System.out.println("Balance after withdrawn"+balance);
}
else{
System.out.println("insufficient balance");
}
}

void display(){
System.out.println("Account Number ;" +Account_num);
System.out.println("Account Balance ;" +balance);


}

}

public class Banktask{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Account Number");
int acc_num = sc.nextInt();
System.out.println("Enter initial Balance");
double bal = sc.nextDouble();
BankAcc acc= new BankAcc(acc_num,bal);
System.out.println("enter amount to depoist");
double deposits = sc.nextDouble();
acc.deposit(deposits);
System.out.println("enter amount to withdrawn:");
double withdrawns = sc.nextDouble();

acc.withdraw(withdrawns);
acc.display();
sc.close();

 


}
}









