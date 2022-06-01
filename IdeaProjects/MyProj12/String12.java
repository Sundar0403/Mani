package srt;
import java.util.*;

public class String12
{
    public void task12(String s1)
    {
      	System.out.println("The Lowercase Converted String is : "+s1.toLowerCase());
    }
    public static void main(String args[])
    {
        String12 s=new String12();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Uppercase String");
        String ss = sc.nextLine();
        s.task12(ss);
    }
}
