import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Write{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Text :");
String input = sc.nextLine();
try{
FileWriter f=new FileWriter("Write.txt");
f.write(input);
f.close();
System.out.println("Text Wrote to File !");

}
catch(IOException e){

System.out.println("Error !" +e);

}


sc.close();

}



}