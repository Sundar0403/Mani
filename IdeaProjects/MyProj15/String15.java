package sss;
import java.util.*;

public class String15
{
    public void task15(String s2[],int m)
    {
        for(int j=0;j<m;j++)
        {
            s2[j]=s2[j].trim()+"";
            System.out.print(s2[j]);
        }
    }
    public static void main(String args[])
    {
        String15 s=new String15();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of strings");
        int n=sc.nextInt();
        String s1[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s1[i]=sc.nextLine();
        }
        s.task15(s1,n);
    }
}
