package dd;
import java.util.*;

public class String16
{
    public void task16(String s1)
    {
        System.out.println(Arrays.toString(s1.split(" ")));
    }
    public static void main(String args[])
    {
        String16 s=new String16();
        Scanner sc=new Scanner(System.in);
        String s11=sc.nextLine();
        s.task16(s11);
    }
}