import java.util.Scanner;
class Students{
int stdnum;
String stdname;
Students(int stdno,String sname){
stdnum=stdno;
stdname=sname;
System.out.println("Student id :"+stdnum);
System.out.println("Student name :"+stdname);
}

}
class Marks extends Students{
int mark1;
int mark2;
int average;
Marks(int stdno,String sname,int m1,int m2){
super(stdno,sname);
mark1=m1;
mark2=m2;
average = (mark1 + mark2) / 2;
}
void display(){
System.out.println("Mark1 :" +mark1);
System.out.println("Mark2 :" +mark2);
System.out.println("Total Avgerage :" +average);


}
}
public class Studtask{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Student id");
int stid = sc.nextInt();
sc.nextLine();
System.out.println("Enter Student name :");
String name = sc.nextLine();
System.out.println("Enter Mark1 :");
int m_1 = sc.nextInt();
System.out.println("Enter Mark2 :");
int m_2 = sc.nextInt();


Marks mrk = new Marks(stid,name,m_1,m_2);
mrk.display();
sc.close();

}
}