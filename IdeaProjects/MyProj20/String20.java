package mine;
import java.util.*;

public class String20
{
    public void task20(String s2)
    {
        System.out.println(""+s2.trim());
    }
    public static void main(String args[])
    {
        String20 s=new String20();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the New String");
        String s1=sc.nextLine();
        s.task20(s1);
    }
}
