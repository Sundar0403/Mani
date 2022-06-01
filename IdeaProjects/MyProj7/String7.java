package ss;
import java.util.*;

public class String7
{
    public void task7(String s1)
    {
        String pm=s1.substring(0,3);
        System.out.println("The Required String is "+ pm);
    }
    public static void main(String args[])
    {
        String7 s=new String7();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the New String");
        String sd=sc.nextLine();
        s.task7(sd);
    }
}
