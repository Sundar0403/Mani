package sd;
import java.util.*;

public class String5
{
    public void task5(String s1,char d)
    {
        char ch[]=s1.toCharArray();
        int pos=0;
        for(int i=0;i<s1.length();i++)
        {
            if(d==ch[i])
            {
                pos=i;
            }
        }
        System.out.println("The Greatest Position of the Given Character is :" +pos);
    }
    public static void main(String args[])
    {
        String5 s=new String5();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the New String");
        String pd=sc1.nextLine();
        System.out.println("Enter the Character");
        char c=sc1.next().charAt(0);
        s.task5(pd,c);
    }
}
