package svc;
import java.util.*;

public class String3
{
    public void task3(String s1,int n) 
    {
        char ch[]=new char[n];
        for(int i=0;i<n;i++)
        {
             ch[i]=s1.charAt(i);
        }
        System.out.println("The Penultimate character is :"+ch[n-2]);
    }
    public static void main(String args[])
    {
        String3 s=new String3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the New String");
        String st=sc.nextLine();
        int n=st.length();
        s.task3(st,n);
    }
}
