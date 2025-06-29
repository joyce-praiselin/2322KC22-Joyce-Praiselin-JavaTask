class Number extends Thread{
public void run(){
for(int i=1;i<=10;i++){
System.out.println(i);

try
{
sleep(100);
}
catch(InterruptedException e)
{
System.out.println(e);

}

}
}
}
class Sleepjoin{
public static void main(String[] args){
Number n1=new Number();
Number n2=new Number();
n1.setName("Thread-1");
n2.setName("Thread-2");
n1.start();

try{
n1.join();

}
catch(InterruptedException e)
{
System.out.println(e);



}
n2.start();

}

}