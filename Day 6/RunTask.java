class Run implements Runnable {
public void run(){

System.out.println("The Code is Running is the Thread");



}




}
public class RunTask{
public static void main(String[] args){
System.out.println("The Code is outside the thread");
Run r1=new Run();
Thread t1=new Thread(r1);
Run r2=new Run();
Thread t2=new Thread(r2);
Run r3=new Run();
Thread t3=new Thread(r3);

t1.start();
t2.start();
t3.start();

}


}