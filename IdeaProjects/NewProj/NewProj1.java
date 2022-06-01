package ps;
import java.lang.*;
import java.util.*;

public class NewProj1
{
    public void fun(String str)
    {
        StringBuilder str1=new StringBuilder("");
        System.out.println("Length of Str1:"+str1.length());
        str1.append(str);
        System.out.println("The Length of Str2:"+str1+" is "+str1.length());
    }
    public static void main(String args[])
    {
        NewProj1 n=new NewProj1();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        n.fun(str);
    }
}
