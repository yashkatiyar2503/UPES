import java.util.*;
class Travel
{
    	static int available_seats;
    	synchronized void booking(int seat)
    	{    
        	System.out.println("Confirming booking of seat...");    
        	if(available_seats <seat)
        	{    
            	System.out.println("No seats available, waiting for confirmation...");    
            	try
            	{   
                		wait();
            	}
            	catch(Exception e)
            	{}    
        	}    
        	available_seats=available_seats-seat;    
        	System.out.println("Booking confirmed...");    
    	}    
    	synchronized void cancel(int seat)
    	{    
        	System.out.println("Processing cancellation...");    
        	available_seats=available_seats+seat;    
        	System.out.println("Cancellation confirmed... ");    
        	notify();    
    	}    
}   
public class Threads 
{
    	public static void main(String args[])
    	{  
        	Scanner Sc = new Scanner(System.in);
        	Travel obj = new Travel();  
        	System.out.print("Enter the number of available seats: ");
	    	obj.available_seats = Sc.nextInt();
	    	System.out.println("Total available seats: " + obj.available_seats);
        	int a;
        	System.out.println("Enter the number of seats to be booked:"); 
        	a=Sc.nextInt();
        	new Thread()
        	{    
            	public void run()
            	{  
                		obj.booking(a);
            	}    
        	}.start();    
        	new Thread()
        	{    
            	public void run()
            	{
                		int b;
                		System.out.println("Enter the number of seats to be cancelled:"); 
                		b=Sc.nextInt();
                		obj.cancel(b);
            	}    
        	}.start();  
    	}
}
