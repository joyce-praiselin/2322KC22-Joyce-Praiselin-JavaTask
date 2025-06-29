import java.util.HashMap;
import java.util.Map;
public class HashMapMarks{
public static void main(String[] args){
HashMap<String,Integer> stud=new HashMap<String,Integer>();
stud.put("Akil",90);
stud.put("Bruce",78);
stud.put("Cathy",80);
stud.put("Dorathy",79);
int total=0;
System.out.println("Student Marks :");
for(String name : stud.keySet()){
int mark =stud.get(name);
System.out.println(name +"-"+ mark);

total+=mark;
}
int avg= total/stud.size();

System.out.println("Class Avg Marks :" +avg);

}
}