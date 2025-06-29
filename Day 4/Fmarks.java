
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Fmarks{
public static void main(String[] args){


try{
File file = new File("Fmarks.txt");
Scanner ss=new Scanner(file);

while(ss.hasNextLine()){
String marks=ss.nextLine();
System.out.println("Display Marks :" +marks);

}
ss.close();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Result :");
String result = sc.nextLine();
try{
FileWriter f=new FileWriter("Fmarks.txt");
f.write(result);
f.close();
System.out.println("Result Wrote to the file!");

}
catch(IOException e){

System.out.println("Error !" +e);

}
sc.close();

}
catch(FileNotFoundException e){
System.out.println("File Not Found" +e);

}





}

}
