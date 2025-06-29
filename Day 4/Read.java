import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Read{
public static void main(String[] args){
try{
File file = new File("file.txt.txt");
Scanner sc=new Scanner(file);

while(sc.hasNextLine()){
String word=sc.nextLine();
System.out.println("Contents" +word);

}
sc.close();

}
catch(FileNotFoundException e){
System.out.println("File Not Found" +e);

}

}
}