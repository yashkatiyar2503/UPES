import java.util.*;
public class Experiment8_1 
{
    	public static void main(String[] args) 
    	{
        	Scanner Sc=new Scanner(System.in);
        	System.out.print("Enter a string:");
        	String str=Sc.nextLine();
        	int c=0;
        	int f=0;
        	int l=0;
        	System.out.print("Enter a character or substring to be searched:");
        	String a=Sc.next();
        	int n=a.length();
        	for(int i=0; i<str.length()-(a.length()-1); i++)
        	{
            	String s=str.substring(i,n+i);
            	if(a.equals(s))
            	{
                		c++;
                		if(c == 1)
                		{
                    		f=i;
                    		l=i;
                		}
                		else
                		{
                    		l = i;
                		}
            	}
        	}
        	System.out.println("First Occurance:"+(f));
        	System.out.println("Last Occurance:"+(l));
    	}
}
