package kkdn;
import java.util.*;
public class String19
{
    public void task19(String p,String d)
    {
        if(p.equalsIgnoreCase(d))
        {
            System.out.println("The Given Two Strings are Equal");
        }
        else
        {
            System.out.println("The Given Two Strings are Not Equal");
        }
    }
    public static void main(String args[])
    {
        String19 s=new String19();
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s.task19(s1,s2);
    }
}
