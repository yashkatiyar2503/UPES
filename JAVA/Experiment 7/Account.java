import java.util.*;
class NoSufficientFundException extends Exception  
{  
    	public NoSufficientFundException (String s)  
    	{
        	super(s);  
    	}  
}
public class Account
{
    	public void validate(int balance, int wd) throws NoSufficientFundException
    	{    
        	if(wd > balance)
        	{   
            	throw new NoSufficientFundException("Money cannot be withdrawn.");    
        	}  
        	else 
        	{   
            	System.out.println("Money has been withdrwan.");
            	System.out.println("Total balane: " + (balance-wd));   
        	}   
     	} 
    	public static void main(String args[])  
    	{
        	Scanner Sc=new Scanner(System.in);
        	System.out.print("Total balance: ");
        	int balance = Sc.nextInt();
        	int ch;
        	Account obj=new Account();
        	char choice;
        	do
        	{
            	choice='\u0000';
            	System.out.println("1.Deposit Money\n2.Withdraw Money");
            	System.out.print("Enter your choice:");
            	ch=Sc.nextInt();
            	switch(ch)
            	{
                		case 1:
                		{
                    		System.out.print("Enter the amount to be deposited:");
                    		int d= Sc.nextInt();
                    		balance=balance+d;
                    		System.out.println("Total balane: " + balance);
                		}
                		break;
                		case 2:
                		{
                    		System.out.print("Enter the amount to be withdrawn:");
                    		int wd= Sc.nextInt();
                    		try  
                    		{  
                        		obj.validate(balance, wd);
                    		}  
                    		catch (NoSufficientFundException e)  
                    		{
                        		System.out.println(e);  
                    		}  
                		}
                		break;
                		default:
                		System.out.println("Enter a Valid Choice.");
            	}
            	System.out.println("Do you want to continue?(y|n)");
            	choice = Sc.next().charAt(0);
        	}while(choice=='y'||choice=='Y'); 
    	}  
} 
