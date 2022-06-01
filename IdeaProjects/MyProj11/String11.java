package pa;
import java.util.*;

public class String11
{
    public void task11(String s1)
    {
        System.out.println("The Uppercase Converted String is :" + s1.toUpperCase());
    }
    public static void main(String args[])
    {
        String11 s=new String11();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lowercase String");
        String ss = sc.nextLine();
        s.task11(ss);
    }
}
