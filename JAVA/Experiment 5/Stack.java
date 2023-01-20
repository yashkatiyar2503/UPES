import java.util.*;
interface StackInterface 
{
    	void push(int a);
    	int pop();
    	void display();
}
class StackClass implements StackInterface 
{
    	int arr[];
    	int t;
    	int c;
    	StackClass(int size) 
    	{
        	arr = new int[size];
        	t = -1;
        	c = size - 1;
    	}
	public void push(int n) 
    	{
        	if (t == c) 
        	{
            	System.out.println("Overflow");
        	} 
		else 
        	{
            	arr[++t] = n;
        	}
    	}
    	public int pop()
    	{
        	if (t == -1) 
        	{
            	System.out.println("Underflow");
        	}
        	else if(t == 0) 
        	{
            	t=-1;
        	}
        	else 
        	{
            	return arr[--t];
        	}
        	return 0;
    	}

    	public void display() 
    	{
        	System.out.println("Stack");
        	for (int i = t; i >=0; i--) 
        	{
            	if (t == -1) 
            	{
                		System.out.println("Stack is empty.");
            	} 
			else 
            	{
                		System.out.println(arr[i]);
            	}
        	}
    	}
}
public class Experiment5_5 
{
    	public static void main(String[] args) 
    	{
        	Scanner Sc = new Scanner(System.in);
        	System.out.println("Enter the size: ");
        	int n = Sc.nextInt();
        	StackClass s = new StackClass(n);
        	char choice;
        	do
        	{
            	choice='\u0000';
            	System.out.println("1.Push\n2.Pop\n3.Display");
            	System.out.println("Enter the choice: ");
            	int ch = Sc.nextInt();
            	switch (ch) 
            	{
                		case 1: 
                		{
                    		System.out.println("Enter the number to be pushed");
                    		int x = Sc.nextInt();
                    		s.push(x);
                		}
                		break;
                		case 2: 
                		{
                    		s.pop();
                		}
                		break;
                		case 3: 
                		{
                    		s.display();
                		}
                		default: 
                		{
                    		System.out.println("Enter the valid choice.");
                		}
            	}
            	System.out.println("Do you want to continue?(y|n)");
            	choice = Sc.next().charAt(0);
        	}while(choice=='y'||choice=='Y');
    	}
}
