import java.util.*;
public class Exceptions 
{
    	public void arithmeticExp()
    	{
        	Scanner Sc=new Scanner(System.in);
        	System.out.print("Enter the value of a and b:");
        	int a=Sc.nextInt();
        	int b=Sc.nextInt();
        	try 
        	{
            	int d = a / b; 
            	System.out.println("Output = " + d);
        	}
        	catch(ArithmeticException e) 
        	{
            	System.out.println("e");
        	}
    	}
    	public void nullPointerExp()
    	{
        	try 
        	{
            	String str = null;
            	System.out.println(str.charAt(0));
        	}
        	catch (NullPointerException e) 
        	{
            	System.out.println(e);
        	}
    	}
    	public void arrayIndexOutOfBoundsExp()
    	{
        	Scanner Sc=new Scanner(System.in);
        	System.out.print("Enter the range of array:");
        	int n=Sc.nextInt();
        	int a[]= new int[n];
        	try 
        	{
            	a[n+1] = 23;
        	}
        	catch (ArrayIndexOutOfBoundsException e) 
        	{
            	System.out.println(e);
        	}
    	}
    	public void stringIndexOutOfBoundsExp()
    	{
        	Scanner Sc=new Scanner(System.in);
        	String str;
        	System.out.println("Enter a string:");
        	str=Sc.nextLine();
        	try 
        	{
            	int l=str.length();
            	char c = str.charAt(l); 
            	System.out.println(c);
        	}
        	catch (StringIndexOutOfBoundsException e) 
        	{
            	System.out.println(e);
        	}
    	}
    	public void classNotFoundExp()
    	{
        	try
        	{
            	Class.forName("Yash");
        	}
        	catch(ClassNotFoundException e)
        	{
            	System.out.println(e);
        	}
    	}
    	public void illegalArgumentExp(int a)
    	{
        	if(a>=18)
        	{
            	System.out.println("Eligible for Voting");
        	}
        	else
        	{
            	throw new IllegalArgumentException("Not Eligible for Voting");
        	}
    	}
    	public void numberFormatExp()
    	{
        	Scanner Sc=new Scanner(System.in);
        	String str;
        	System.out.println("Enter a string:");
        	str=Sc.nextLine();
        	try 
        	{
            	int n = Integer.parseInt(str);
            	System.out.println(n);
        	}
        	catch (NumberFormatException ex) 
        	{
            	System.out.println(ex);
        	}
    	}
    	public void inputMismatchExp()
    	{
        	Scanner Sc = new Scanner(System.in);   
        	try 
        	{  
            	System.out.println("Enter the value:");  
            	int n = Sc.nextInt();   
            	System.out.println((n*n));  
        	}   
        	catch (InputMismatchException ex) 
        	{  
            	System.out.println(ex);  
        	}  
    	}
    	public static void main(String[] args) 
    	{
        	Exceptions obj=new Exceptions();
        	Scanner Sc = new Scanner(System.in);
        	char choice;
        	do
        	{
            	choice='\u0000';
            	System.out.println(" (1) ArithmeticException\n (2) NullPointerException\n (3) ArrayIndexOutOfBoundsException\n (4) StringIndexOutOfBoundsException\n (5) ClassNotFoundException\n (6) IllegalArgumentException\n (7) NumberFormatException\n (8) InputMismatchException\n (9)Exit");
            	System.out.println("Enter the choice: ");
            	int ch = Sc.nextInt();
            	switch (ch) 
            	{
                		case 1: 
                		{
                    		obj.arithmeticExp();
                		}
                		break;
                		case 2: 
                		{
                    		obj.nullPointerExp();
                		}
                		break;
                		case 3: 
                		{
                    		obj.arrayIndexOutOfBoundsExp();
                		}
                		break;
                		case 4:
                		{
                    		obj.stringIndexOutOfBoundsExp();
                		}
                		break;
                		case 5:
                		{
                    		obj.classNotFoundExp();
               		}
				break;
                		case 6:
                		{
                    		System.out.print("Enter the age:");
                    		int age = Sc.nextInt();
                    		obj.illegalArgumentExp(age);
                		}
                		break;
                		case 7:
                		{
                    		obj.numberFormatExp();
                		}
                		break;
                		case 8:
                		{
                    		obj.inputMismatchExp();
                		}
                		break;
                		case 9:
                		{
                    		System.exit(0);
                		}
				break;
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
