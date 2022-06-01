package rgs;
import java.util.*;

public class String13
{
    public void task13(String s1)
    {
        String ss2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            ss2=ss2+s1.charAt(i);
        }
        System.out.println("The Reverse String is : "+ss2);
    }
    public static void main(String args[])
    {
        String13 s=new String13();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String ss1=sc.nextLine();
        s.task13(ss1);
    }
}
