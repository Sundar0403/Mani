package ds;
import java.util.*;

public class String4
{
    public void task4(String s1,char d)
    {
        char ch[]=s1.toCharArray();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(d==ch[i])
            {
                count++;
            }
        }
        System.out.println("The Number of Occurences are :" + count);
    }
    public static void main(String args[])
    {
        String4 s=new String4();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the New String");
        String pd=sc1.nextLine();
        System.out.println("Enter the Character");
        char c=sc1.next().charAt(0);
        s.task4(pd,c);
    }
}

