import java.util.Scanner;
class Employee{
int emp_no;
String emp_name;
Employee(int eno,String ename){
emp_no = eno;
emp_name = ename;
System.out.println("Eno"+emp_no);
System.out.println("Ename"+emp_name);
}
}
class Salary extends Employee{
double basicpay;
double hra;
double da;
Salary(int eno,String ename,double bp,double hra1,double da1){
super(eno,ename);
basicpay = bp;
hra = hra1;
da = da1;
}
public double basic_pay(){

return basicpay;
}
public double calc_hra(){
return basicpay * hra;
}
public double calc_da(){
return  basicpay * da;
}
public double calc_sal(){
return basicpay + calc_hra() + calc_da();
}
void display(){
System.out.println("Basic pay" +basicpay);
System.out.println("HRA" +calc_hra());
System.out.println("DA" +calc_da());
System.out.println("Total_salary:" +calc_sal());

}


}
public class EmpyTask{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter eno");
int eno = sc.nextInt();
sc.nextLine();

System.out.println("Enter ename");
String ename = sc.nextLine();

System.out.println("Enter Basic pay");
double bp = sc.nextDouble();
System.out.println("Enter Hra");
double hra1 = sc.nextDouble();
System.out.println("Enter da");
double da1 = sc.nextDouble();
Salary  emp = new Salary(eno,ename,bp,hra1,da1);
emp.display();

}
}