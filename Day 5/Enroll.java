import java.util.*;
public class Enroll{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
ArrayList<String> student = new ArrayList<String>();
HashMap<String,ArrayList<String>> student_course=new HashMap<String,ArrayList<String>>();
int choice;
do{
System.out.println("--Enrollment--");
System.out.println("1.Add Student and Courses ");
System.out.println("2.Remove student");
System.out.println("3.Display all students and courses");
System.out.println("4.Exit");
System.out.println("Enter Choice :");
choice =sc.nextInt();
sc.nextLine(); 

switch(choice){
case 1:
System.out.println("Enter name :");
String name=sc.nextLine();
student.add(name);

ArrayList<String> courses = new ArrayList<String>();

System.out.println("Enter NO.OF.Course :");
int n=sc.nextInt();
 sc.nextLine();
for(int i=1;i<=n;i++){
System.out.println("Enter Course" +i);
String course=sc.nextLine();
courses.add(course);



}
student_course.put(name,courses);
break;
case 2:
System.out.println("Enter name to remove :");
String remove_name=sc.nextLine();
if(student.remove( remove_name)){
student_course.remove( remove_name);
System.out.println("Student Removed");
}
else
{
System.out.println("Remove failed");
}
break;
case 3:
System.out.println("Students and Courses :");
Iterator<String> it=student.iterator();
while(it.hasNext()){
String sname=it.next();
System.out.println(sname);
ArrayList<String> scourses = student_course.get(sname);
if (scourses != null) {
for (String c : scourses) {
System.out.println("-" + c);
}
}

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