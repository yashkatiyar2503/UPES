import java.util.*;
class Call
{
    	double charges(String type)
    	{
        	if(type.equals("Ordinary"))
        	{
            	return 3.6;
        	}
        	else if(type.equals("Urgent"))	
        	{
            	return 4.8;
        	}
        	else if(type.equals("Lightning"))
        	{
            	return 5.6;
        	}
        	else
        	{
            	return 0.0;
        	}
    }
}
class Bill extends Call
{
    	public static void main(String[] args) 
    	{
        	Scanner Sc=new Scanner(System.in);
        	double d;
        	String t;
        	System.out.println("Enter the type and duration of call: ");
        	t=Sc.next();
        	d=Sc.nextDouble();
        	Bill obj= new Bill();
        	System.out.println("Type of Call:"+t);
        	System.out.println("Duration of Call:"+d);
        	System.out.println("Bill:" + obj.charges(t)*d);
    	}   
}
