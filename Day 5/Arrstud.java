import java.util.ArrayList;
import java.util.Iterator;
public class ArrStud{
public static void main(String[] args){
ArrayList<String> stud=new ArrayList<String>();
stud.add("Akil");
stud.add("Bruce");
stud.add("Cathy");
stud.add("Dorathy");
Iterator<String> it=stud.iterator();
while(it.hasNext())
{
String name = it.next();
System.out.println(name);
}
}



}