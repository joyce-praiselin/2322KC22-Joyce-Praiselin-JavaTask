import java.util.Scanner;
class TicketBooking {
int seats;
TicketBooking(int s) {
seats = s;
}
synchronized void book(String name, int count) {
if (seats >= count) {
System.out.println(name + " trying to book " + count + " tickets");
try { 
Thread.sleep(500); 
} 
catch (Exception e) {}
seats = seats - count;
System.out.println(name + " booked. Seats left: " + seats);
} 
else 
{
System.out.println(name + " failed. Only " + seats + " seats left");
}
}
}

class BookingThread extends Thread {
TicketBooking tb;
String user;
int count;

BookingThread(TicketBooking tb, String user, int count) 
{
this.tb = tb;
this.user = user;
this.count = count;
}

public void run() {
tb.book(user, count);
}
}

public class Ticket {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter total seats: ");
int total = sc.nextInt();

TicketBooking tb = new TicketBooking(total);

BookingThread t1 = new BookingThread(tb, "User1", 2);
BookingThread t2 = new BookingThread(tb, "User2", 3);
BookingThread t3 = new BookingThread(tb, "User3", 2);

t1.start();
t2.start();
t3.start();

sc.close();
}
}
