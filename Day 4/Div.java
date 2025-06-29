import java.io.*;
class Div{
public static void main(String[] args)throws IOException
{
int a;
int b;
int result;
DataInputStream in = new DataInputStream(System.in);
System.out.println("Enter divisor");
a = Integer.parseInt(in.readLine());
System.out.println("Enter dividend");
b =  Integer.parseInt(in.readLine());

try{
if(b==0){
throw new ArithmeticException("Cannot divide by zero");
}
else{
result = a/b;
System.out.println("Result " +result);
}
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
}

}