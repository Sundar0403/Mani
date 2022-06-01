package arc;
import java.util.*;
public class String18
{
    public void task18(String s11,String s12)
    {
        if(s11.equals(s12))
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
        String18 s=new String18();
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s.task18(s1,s2);
    }
}
