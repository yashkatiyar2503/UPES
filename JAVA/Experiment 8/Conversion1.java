import java.util.*;
public class Experiment8_5 
{
    public static void main(String[] args) 
    {
        
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=Sc.nextInt();
        Integer obj=Integer.valueOf(n);
        System.out.println("int="+n+" Integer=" + obj);
        String s=Integer.toString(obj);
        System.out.println("Integer="+obj+" String=" + s);
        int t=Integer.parseInt(s);
        System.out.println("String="+s+" int=" + t);
        String str1=Integer.toString(n);
        System.out.println("int="+n+" String=" + s);
        Integer m=Integer.parseInt(s);
        System.out.println("String="+s+" Integer=" + m);
        m=n;
        System.out.println("Integer="+m+" int=" +n);
    }
}
