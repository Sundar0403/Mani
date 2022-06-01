package pdms;
import java.util.*;

public class String2
{
    public void task2(String s1) 
    {
        char ch[]=new char[s1.length()];
        for(int i=0;i<s1.length();i++)
        {
            ch[i]=s1.charAt(i);
            System.out.println(ch[i]);
        }

    }
    public static void main(String args[])
    {
        String2 s=new String2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Given String");
        String s11=sc.nextLine();
        s.task2(s11);
    }
}
