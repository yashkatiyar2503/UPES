import java.util.*;
public class Experiment8_6
{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter a float number:");
        float n=Sc.nextFloat();
        Float obj=Float.valueOf(n);
        System.out.println("float="+n+" Float=" + obj);
        String s=Float.toString(obj);
        System.out.println("Float="+obj+" String=" + s);
        float t=Float.parseFloat(s);
        System.out.println("String="+s+" float=" + t);
        String str1=Float.toString(n);
        System.out.println("float="+n+" String=" + s);
        Float m=Float.parseFloat(s);
        System.out.println("String="+s+" Float=" + m);
        float p=m;
        System.out.println("Float="+m+" float=" +p);
    }
}
