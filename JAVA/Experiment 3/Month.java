import java.util.*;
public class Month
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int n;
		String m[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println("Enter the number:");
		n=Sc.nextInt();
		if(n>=1 && n<=12)
		{
			for(int i=0; i<=n-1; i++)
			{
				if(i==n-1)
				{
					System.out.println("The month is "+m[i]);
					break;			
				}
			}
		}
		else
		{
			System.out.println("Enter the number between 1 and 12.");
		}
	}
} 
