import java.util.*;
class Employee
{
    	String name;
    	int empid;
    	double salary;
    	Employee(){}
    	Employee(String n, int id, double s)
    	{
        	name=n;
        	empid=id;
        	salary=s;
    	}
    	String naMe()
    	{
        	return name;
    	}
    	double saLary()
    	{
        	return salary;
    	}
    	double increaseSalary(double per)
    	{
        	double inc=salary*(per/100);
        	double sal=salary+inc;
        	return sal;
    	}
}
class Manager extends Employee 
{
    	public String department="Department";
    	public static void main(String[] args) 
    	{
        	Scanner Sc=new Scanner (System.in);
        	String n;
        	int id;
        	double s;
        	double p;
        	System.out.println("Enter the name, Employee ID and salary of the employee:");
        	n=Sc.nextLine();
        	id=Sc.nextInt();
        	s=Sc.nextDouble();
        	System.out.println("Enter increased percentage in salary of the employee:");
        	p=Sc.nextInt();
        	Employee obj=new Employee(n, id, s);
        	System.out.println("Name: " + obj.naMe());
        	System.out.println("Salary: " + obj.saLary());
        	System.out.println("Increased Salary: " + obj.increaseSalary(p));
    	}
}
