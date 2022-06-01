package ms;
import java.util.*;

public class String6
{
    public void task6(String s1)
    {
        String pm=s1.substring(s1.length()-5);
        System.out.println("The Required String is "+ pm);
    }
    public static void main(String args[])
    {
        String6 s=new String6();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the New String");
        String sd=sc.nextLine();
        s.task6(sd);
    }
}
