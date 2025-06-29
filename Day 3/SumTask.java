import java.util.Scanner;
class sum{
int sum(int a,int b){
return a+b;
}
double sum(double a,double b){
return a+b;
}
}
public class SumTask{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
sum add = new sum();
System.out.println("Enter Interger Values");
int int1 = sc.nextInt();
int int2 = sc.nextInt();
int res1 = add.sum(int1,int2);
System.out.println("Int Sum"+res1);
System.out.println("Enter Double values");
double db1 = sc.nextDouble();
double db2 = sc.nextDouble();
double res2 = add.sum(db1,db2);
System.out.println("Double Sum"+res2);
sc.close();



}
}