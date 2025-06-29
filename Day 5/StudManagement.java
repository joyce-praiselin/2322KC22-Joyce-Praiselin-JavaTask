import java.util.*;
import java.io.*;

public class StudManagement{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
ArrayList<String> student = new ArrayList<String>();
HashMap<String,ArrayList<String>> student_course=new HashMap<String,ArrayList<String>>();
int choice;
do{
System.out.println("--Student Management System --");
System.out.println("1.Add Student and Courses ");
System.out.println("2.Search student");
System.out.println("3.Remove student");
System.out.println("4.Exit");
System.out.println("Enter Choice :");
choice =sc.nextInt();
sc.nextLine(); 

switch(choice){
case 1:
System.out.println("Enter name :");
String name=sc.nextLine();
System.out.println("Enter ID :");
String id=sc.nextLine();

student.add(name);
student.add(id);

ArrayList<String> courses = new ArrayList<String>();

System.out.println("Enter NO.OF.Course :");
int n=sc.nextInt();
 sc.nextLine();

for(int i=1;i<=n;i++){
System.out.println("Enter Course" +i);
String course=sc.nextLine();
courses.add(course);



}
student_course.put(id,courses);
break;

case 2:
System.out.println("Enter ID to search :");
String search_id=sc.nextLine();
if(student_course.containsKey(search_id)){

System.out.println("Courses ");
for (String c : student_course.get(search_id)) {
System.out.println(" - " + c);
}
}
else
{
System.out.println("student not found");
}
break;
case 3:
System.out.println("Enter ID to delete :");
String delete_id=sc.nextLine();
if(student_course.containsKey(delete_id))
{
student_course.remove(delete_id);
System.out.println(" Student removed.");
}
else
{
System.out.println("Error removing ");
}


break;


case 4:
System.out.println("Exiting");
break;
default :

System.out.println("Invalid Choice ");
}
}while(choice!=4);
sc.close();








}




}