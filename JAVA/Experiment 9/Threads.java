import java.util.*;
class Demo1 extends Thread
{
    	synchronized static void odd(int n)
    	{
        	for(int i=1; i<=n; i++)
        	{
            	if(i%2==0)
            	{
                		System.out.println("Thread 1:"+i);
            	}
        	}
    	}
    	synchronized static void even(int m)
    	{
        	for(int i=1; i<=m; i++)
        	{
        	    	if(i%2!=0)
            	{
                		System.out.println("Thread 2:"+i);
            	}
        	}
    	} 
}
class Demo2 implements Runnable
{
    	synchronized static void fib(int y)
    	{
        	int num1 = 0, num2 = 1;
        	int counter = 0;
        	while (counter < y) 
        	{
            	System.out.print(num1 + " ");
            	int num3 = num2 + num1;
            	num1 = num2;
           	 	num2 = num3;
            	counter = counter + 1;
        	}
    	}
	public void run()
	{
        	Scanner Sc=new Scanner(System.in);
        	System.out.println("Enter the value of y:");
        	int y=Sc.nextInt();
        	fib(y);
	}
}
public class Exp9_1 
{
    	public static void main(String args[])
	{
        	Scanner Sc=new Scanner(System.in);
		Demo1 t1=new Demo1();
        	int n;
        	System.out.println("Enter the value of n:");
        	n=Sc.nextInt();
		Thread t=new Thread()
		{
			public void run()
			{
				t1.odd(10);
			}
		};
        	Demo1 t2=new Demo1();
        	int m;
        	System.out.println("Enter the value of m:");
        	m=Sc.nextInt();
		Thread tt=new Thread()
		{
			public void run()
			{
				t2.even(10);
			}
		};
		t.start();
		tt.start();
        	Demo2 obj=new Demo2();
		Thread t3=new Thread(obj);
		t3.start();
    	}
}
