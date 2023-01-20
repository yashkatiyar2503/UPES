public class Calculator
{
  	public static void add(int a, int b) 
	{
    	int result = a + b;
    	System.out.println(a + " + " + b + " = " + result);
  	}
	public static void subtract(int a, int b) 
	{
    	int result = a - b;
    	System.out.println(a + " - " + b + " = " + result);
  	}
	public static void multiply(int a, int b) 
	{
    	int result = a * b;
    	System.out.println(a + " * " + b + " = " + result);
  	}
	public static void divide(int a, int b) 
	{
    	int result = a / b;
    	System.out.println(a + " / " + b + " = " + result);
  	}
	static void mod(int a, int b) 
	{
		int result = a % b;
		System.out.println(a + " % " + b + " = " + result);
	}
	public static void main(String[] args) 
	{
    		int a = Integer.parseInt(args[0]);
    		int b = Integer.parseInt(args[1]);
    		add(a, b);
    		subtract(a, b);
    		multiply(a, b);
    		divide(a, b);
		mod(a, b);
  	}
}
