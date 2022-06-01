package rgs;
import java.util.*;

public class String14
{
    public void task14(String s1[],int m)
    {
        for(int j=0;j<m;j++)
        {
            System.out.println("The Strings are SS["+j+"] : "+s1[j]);
        }
    }
    public static void main(String args[])
    {
        String14 s=new String14();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Strings : ");
        int n=sc.nextInt();
        System.out.println("Enter the Strings :");
        String ss[]=new String[n];
        for(int i=0;i<n;i++)
        {
            ss[i]=sc.next();
        }
        s.task14(ss,n);
    }
}
